package org.z7.graphs_simplified.graphs.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;

import java.util.List;

public interface WeightedDirectedGraph<V extends Vertex, W, E extends WeightedDirectedEdge<V, W>> {
    record WeightedTransition<V, W>(V target, W weight) { }
    List<WeightedTransition<V, W>> getWeightedTransitionsFrom(V vertex);
}
