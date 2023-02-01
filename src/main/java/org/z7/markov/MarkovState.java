package org.z7.markov;

public interface MarkovState<C, CONCRETE> {
    void addTransition(CONCRETE state, float probability);
}
