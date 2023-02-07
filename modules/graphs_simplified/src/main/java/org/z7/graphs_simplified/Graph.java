package org.z7.graphs_simplified;

import java.util.List;

public interface Graph<V extends Vertex, E extends Transition<V>> {
    void addVertex(V vertex);

    void addTransition(E transition);

    List<V> getAdjacentFor(V target);
}
