package org.z7.graphs_simplified;

import org.z7.util.Pair;

public interface UndirectedTransition<V extends Vertex> extends Transition<V> {
    Pair<V, V> getVertices();
}
