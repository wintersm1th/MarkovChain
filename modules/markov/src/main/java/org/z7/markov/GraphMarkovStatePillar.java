package org.z7.markov;

import org.z7.markov.graphwrapper.MarkovGraph;
import org.z7.markov.graphwrapper.MarkovTransition;
import org.z7.markov.graphwrapper.MarkovVertex;

public class GraphMarkovStatePillar<C, CONCRETE extends GraphMarkovStatePillar<C, CONCRETE>> implements MarkovState<C, CONCRETE> {

    MarkovGraph<C> linkedGraph;

    MarkovVertex<C> linkedGraphVertex;

    MarkovVertex<C> getLnkedGraphVertex() {
        return this.linkedGraphVertex;
    }

    protected GraphMarkovStatePillar(MarkovGraph<C> linkedGraph, MarkovVertex<C> linkedGraphVertex) {
        this.linkedGraph = linkedGraph;
        this.linkedGraphVertex = linkedGraphVertex;
    }

    public void addTransition(CONCRETE state, float probability) {
        MarkovVertex<C> targetVertex = state.getLnkedGraphVertex();
        this.linkedGraph.addTransition(new MarkovTransition<>(this.linkedGraphVertex, targetVertex, probability));
    }
}
