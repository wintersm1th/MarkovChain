package org.z7.graphs_simplified;

public interface Graph<V extends Vertex, E extends Transition<V>> {
    void addVertex(V vertex);

    void addTransition(E transition);
}
