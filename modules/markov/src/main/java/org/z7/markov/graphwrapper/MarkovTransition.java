package org.z7.markov.graphwrapper;

import org.z7.graphs.transitions.WeightedTransition;

public class MarkovTransition<C> extends WeightedTransition<MarkovVertex<C>, Float> {
    public MarkovTransition(MarkovVertex<C> from, MarkovVertex<C> to, Float weight) {
        super(from, to, weight);
    }
}
