package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.graphs.intf.WeightedGraph;
import org.z7.graphs_simplified.edges.intf.WeightedEdge;

public class WeightedGraphImpl<V extends Vertex, W, E extends WeightedEdge<V, W>>
        extends GraphImpl<V, E>
        implements WeightedGraph<V, E> {
}
