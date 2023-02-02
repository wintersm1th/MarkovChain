package org.z7.graphs_simple;

import org.z7.graphs_simple.vertices.Transition;
import org.z7.graphs_simple.vertices.Vertex;

public interface Graph<V extends Vertex, E extends Transition<V>> {
    void addVertex(V vertex);

    void addTransition(E transition);
}
