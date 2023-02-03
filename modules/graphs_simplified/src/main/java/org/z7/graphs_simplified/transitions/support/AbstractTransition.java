package org.z7.graphs_simplified.transitions.support;

import org.z7.graphs_simplified.Transition;
import org.z7.graphs_simplified.Vertex;
import org.z7.util.Pair;

public class AbstractTransition<V extends Vertex> implements Transition<V> {
    protected Pair<V, V> vertices;
    public AbstractTransition(V from, V to) {
        vertices = new Pair<>(from, to);
    }
}
