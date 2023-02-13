package org.z7.markov_new.intf;

import java.util.List;

public interface MarkovChain<C> {
    MarkovState<C> createState(C content);

    void addTransition(MarkovState<C> from, MarkovState<C> to, Float probability);

    void setInitialState(MarkovState<C> state);

    List<C> generateChain(int maximalSize);
}
