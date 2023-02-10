package org.z7.markov_new.support;

import org.z7.graphs_simplified.edges.WeightedDirectedEdgeImpl;
import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;
import org.z7.markov_new.intf.MarkovState;

public class MarkovEdge<C> extends WeightedDirectedEdgeImpl<MarkovVertex<C>, Float> {
    public MarkovEdge(MarkovVertex<C> from, MarkovVertex<C> to, Float weight) {
        super(from, to, weight);
    }
}
