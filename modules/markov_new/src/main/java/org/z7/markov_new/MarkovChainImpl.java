package org.z7.markov_new;

import org.z7.markov_new.intf.MarkovChain;
import org.z7.markov_new.intf.MarkovState;

import org.z7.markov_new.support.graph_wrapping.MarkovEdge;
import org.z7.markov_new.support.graph_wrapping.MarkovGraph;
import org.z7.markov_new.support.graph_wrapping.MarkovVertex;
import org.z7.markov_new.support.selector.RandomSelector;
import org.z7.markov_new.support.selector.RandomSelectorImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.random.RandomGenerator;

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
    public void setInitialState(MarkovState<C> state) {
        initialState = state;
    }

    @Override
    public List<C> generateChain() {
        return null;
    }
}
