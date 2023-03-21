package org.z7.markov_new;

import org.z7.graphs_simplified.graphs.intf.WeightedDirectedGraph;
import org.z7.markov_new.intf.MarkovChain;
import org.z7.markov_new.intf.MarkovState;

import org.z7.markov_new.support.graph_wrapping.MarkovEdge;
import org.z7.markov_new.support.graph_wrapping.MarkovGraph;
import org.z7.markov_new.support.graph_wrapping.MarkovVertex;
import org.z7.markov_new.intf.RandomSelector;
import org.z7.markov_new.support.selector.ProbableChoice;
import org.z7.markov_new.support.selector.RandomSelectorImpl;

import java.util.*;
import java.util.stream.Collectors;

public class MarkovChainImpl<C> implements MarkovChain<C> {
    private final MarkovGraph<C> graph;

    private final Map<MarkovState<C>, MarkovVertex<C>> verticesStatesMapping;

    private final RandomSelector randomSelector;

    private MarkovState<C> initialState = null;

    {
        verticesStatesMapping = new HashMap<>();
        graph = new MarkovGraph<>();
    }

    public MarkovChainImpl() {
        this.randomSelector = new RandomSelectorImpl();
    }

    public MarkovChainImpl(RandomSelector randomSelector) {
        this.randomSelector = randomSelector;
    }

    @Override
    public MarkovState<C> createState(C content) {
        MarkovStateImpl<C> state = new MarkovStateImpl<>(content);

        MarkovVertex<C> vertex = new MarkovVertex<>();
        graph.addVertex(vertex);
        vertex.setContent(state);

        verticesStatesMapping.put(state, vertex);

        return state;
    }

    @Override
    public void addTransition(MarkovState<C> from, MarkovState<C> to, Float probability) {
        MarkovVertex<C> fromVertex = verticesStatesMapping.get(from);
        MarkovVertex<C> toVertex = verticesStatesMapping.get(to);

        graph.addEdge(new MarkovEdge<>(fromVertex, toVertex, probability));
    }

    @Override
    public void setInitialState(MarkovState<C> state) {
        initialState = state;
    }

    @Override
    public List<C> generateChain(int maximalSize) {
        assert maximalSize > 0;
        assert !Objects.isNull(initialState);

        MarkovVertex<C> initialVertex = verticesStatesMapping.get(initialState);
        assert !Objects.isNull(initialVertex);

        List<C> chain = new ArrayList<>();
        chain.add(initialState.getContent());

        MarkovVertex<C> currentVertex = initialVertex;

        while (chain.size() < maximalSize) {
            List<ProbableChoice<MarkovVertex<C>>> transitions = graph
                    .getWeightedTransitionsFrom(currentVertex)
                    .stream()
                    .map((transition) -> new ProbableChoice<>(transition.weight(), transition.target()))
                    .toList();

            if (transitions.isEmpty()) {
                break;
            }

            currentVertex = randomSelector.choiceFrom(transitions).getContent();
            chain.add(currentVertex.getContent().getContent());
        }

        return chain;
    }
}
