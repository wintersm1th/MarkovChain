package org.z7.graphs_simplified.graphs.intf;

import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;

public interface WeightedDirectedGraph<V extends Vertex, W, E extends WeightedDirectedEdge<V, W>>
    extends DirectedGraph<V, E> {
    List<WeightedTransition<V, W>> getWeightedTransitionsFrom(V vertex);

    record WeightedTransition<V, W>(V target, W weight) {
    }
}
