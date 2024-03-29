package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.edges.intf.DirectedEdge;
import org.z7.graphs_simplified.graphs.intf.DirectedGraph;
import org.z7.graphs_simplified.vertices.intf.Vertex;

public class DirectedGraphImpl<V extends Vertex, E extends DirectedEdge<V>>
        extends GraphImpl<V, E>
        implements DirectedGraph<V, E> {

    @Override
    public void addEdge(E edge) {
        V from = edge.getFrom();
        transitions.get(from).add(edge);
    }
}
