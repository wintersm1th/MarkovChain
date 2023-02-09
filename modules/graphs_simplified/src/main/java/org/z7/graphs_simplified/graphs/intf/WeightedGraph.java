package org.z7.graphs_simplified.graphs.intf;

import org.z7.graphs_simplified.edges.intf.WeightedEdge;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;

public interface WeightedGraph<V extends Vertex, W, E extends WeightedEdge<V, W>> extends Graph<V, E> {
    List<WeightedDirectedGraph.WeightedTransition<V, W>> getWeightedTransitionsFrom(V vertex);
}
