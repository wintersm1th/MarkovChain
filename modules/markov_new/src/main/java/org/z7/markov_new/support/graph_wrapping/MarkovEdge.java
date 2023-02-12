package org.z7.markov_new.support.graph_wrapping;

import org.z7.graphs_simplified.edges.WeightedDirectedEdgeImpl;

public class MarkovEdge<C> extends WeightedDirectedEdgeImpl<MarkovVertex<C>, Float> {
    public MarkovEdge(MarkovVertex<C> from, MarkovVertex<C> to, Float weight) {
        super(from, to, weight);
    }
}
