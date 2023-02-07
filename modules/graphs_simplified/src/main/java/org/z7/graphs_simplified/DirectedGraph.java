package org.z7.graphs_simplified;

import java.util.List;

public class DirectedGraph<V extends Vertex, E extends DirectedTransition<V>> extends AbstractGraph<V, E> {
    @Override
    public void addVertex(V vertex) {

    }

    @Override
    public void addTransition(E transition) {

    }

    @Override
    public List<V> getAdjacentFor(V target) {
        return null;
    }
}
