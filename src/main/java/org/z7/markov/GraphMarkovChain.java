package org.z7.markov;

import java.util.List;

public class GraphMarkovChain<C> implements MarkovChain<C> {

    public GraphMarkovChain() {

    }

    public GraphMarkovState<C> createState(C content) {
        return null;
    }

    public Boolean validate() {
        return null;
    }

    public List<C> generateSequence(int length) {
        return null;
    }
}
