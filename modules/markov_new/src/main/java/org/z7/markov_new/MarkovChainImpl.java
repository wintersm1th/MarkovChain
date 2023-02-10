package org.z7.markov_new;

import org.z7.markov_new.intf.MarkovChain;
import org.z7.markov_new.intf.MarkovState;

import org.z7.markov_new.support.MarkovGraph;
import org.z7.markov_new.support.MarkovEdge;
import org.z7.markov_new.support.MarkovVertex;

import java.util.List;
import java.util.Map;
import java.util.random.RandomGenerator;

public class MarkovChainImpl<C> implements MarkovChain<C> {
    private final RandomGenerator randomGenerator;

    private final MarkovGraph<C> graph = new MarkovGraph<>();

    Map<MarkovState<C>, MarkovVertex<C>> verticesStatesMapping;

    public MarkovChainImpl(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    @Override
    public MarkovState<C> createState(C content) {
        MarkovStateImpl<C> state = new MarkovStateImpl<>(content);

        MarkovVertex<C> vertex = new MarkovVertex<>();
        vertex.setContent(state);

        return state;
    }

    @Override
    public void addTransition(MarkovState<C> from, MarkovState<C> to, Float probability) {
        MarkovVertex<C> fromVertex = verticesStatesMapping.get(from);
        MarkovVertex<C> toVertex = verticesStatesMapping.get(to);

        graph.addEdge(new MarkovEdge<>(fromVertex, toVertex, probability));
    }

    @Override
    public void markStateAsInitial(MarkovState<C> state) {

    }

    @Override
    public List<C> generateChain() {
        return null;
    }
}
