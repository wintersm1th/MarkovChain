package org.z7.graphs_simplified.vertices;

import org.z7.graphs_simplified.DirectedTransition;
import org.z7.graphs_simplified.Graph;
import org.z7.graphs_simplified.Transition;
import org.z7.graphs_simplified.Vertex;

public class DirectedGraph<V extends Vertex, E extends Transition<V> & DirectedTransition<V>> implements Graph<V, E> {
    public void addVertex(V vertex) {

    }

    public void addTransition(E transition) {

    }
}
