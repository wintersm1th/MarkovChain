package org.z7.markov;

import org.z7.markov.graphwrapper.MarkovGraph;
import org.z7.markov.graphwrapper.MarkovVertex;

import java.util.List;

public class GraphMarkovChain<C> implements MarkovChain<C> {
    MarkovGraph<C> baseGraph;

    public GraphMarkovChain() {

    }

    public GraphMarkovState<C> createState(C content) {
        return null;
    }

    public Boolean validate() {
        return null;
    }
}
