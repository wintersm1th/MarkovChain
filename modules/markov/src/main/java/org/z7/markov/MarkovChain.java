package org.z7.markov;

import org.z7.markov.graphwrapper.MarkovVertex;

import java.util.List;

public interface MarkovChain<C> {
    GraphMarkovState<C> createState(C content);

    Boolean validate();
}
