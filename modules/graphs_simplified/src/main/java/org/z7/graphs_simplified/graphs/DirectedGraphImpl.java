package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.graphs.intf.DirectedGraph;
import org.z7.graphs_simplified.edges.intf.DirectedEdge;

public class DirectedGraphImpl<V extends Vertex, E extends DirectedEdge<V>>
        extends GraphImpl<V, E>
        implements DirectedGraph<V, E> {
}
