package org.z7.graphs_simple.vertices;

import org.z7.util.Pair;

class AbstractTransition<V extends Vertex> implements Transition<V> {
    Pair<V, V> vertices;
    AbstractTransition(V from, V to) {
        vertices = new Pair<>(from, to);
    }
}
