package org.z7.graphs_simplified.graphs.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.edges.intf.Edge;

public interface WeightedGraph<V extends Vertex, E extends Edge<V>> extends Graph<V, E> {
}
