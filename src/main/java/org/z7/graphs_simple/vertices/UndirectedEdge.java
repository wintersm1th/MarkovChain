package org.z7.graphs_simple.vertices;

import org.z7.util.Pair;

public interface UndirectedEdge<V extends Vertex> extends Transition<V> {
    Pair<V, V> getVertices();
}
