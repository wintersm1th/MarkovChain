package org.z7.markov;

import org.z7.markov.graphwrapper.MarkovGraph;
import org.z7.markov.graphwrapper.MarkovVertex;

public class GraphMarkovState<C> extends GraphMarkovStatePillar<C, GraphMarkovState<C>> {
    protected GraphMarkovState(MarkovGraph<C> linkedGraph, MarkovVertex<C> linkedGraphVertex) {
        super(linkedGraph, linkedGraphVertex);
    }
}
