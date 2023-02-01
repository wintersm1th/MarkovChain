package org.z7.markov;

import java.util.List;

public interface MarkovChain<C> {
    GraphMarkovState<C> createState(C content);

    Boolean validate();

    List<C> generateSequence(int length);
}
