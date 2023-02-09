package org.z7.graphs_simplified.graphs.intf;

import org.z7.graphs_simplified.edges.intf.DirectedEdge;
import org.z7.graphs_simplified.vertices.intf.Vertex;

public interface DirectedGraph<V extends Vertex, E extends DirectedEdge<V>>
        extends Graph<V, E> {
}
