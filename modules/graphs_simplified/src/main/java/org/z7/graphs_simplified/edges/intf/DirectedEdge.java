package org.z7.graphs_simplified.edges.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;

public interface DirectedEdge<V extends Vertex> extends Edge<V> {
    V getFrom();

    V getTo();
}
