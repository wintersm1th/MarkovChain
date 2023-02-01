package org.z7.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DirectedGraph<V extends VertexPillar<?, V>, T extends Transition<V>> implements Graph<V, T> {
    final Map<V, List<T>> transitions = new HashMap<>();

    private final VertexFactory<V> vertexFactory;

    public DirectedGraph(VertexFactory<V> vertexFactory) {
        this.vertexFactory = vertexFactory;
    }

    public V createVertex() {
        V vertex = vertexFactory.create();
        vertex.bindGraph(this);
        transitions.put(vertex, new LinkedList<>());

        return vertex;
    }

    public void addTransition(T transition) {
        transitions.get(transition.getFrom()).add(transition);
    }

    public void removeTransition(T transition) {
        transitions.get(transition.getFrom()).remove(transition);
    }

    public List<V> getAdjacentFor(V vertex) {
        return transitions.get(vertex).stream().map(Transition::getTo).collect(Collectors.toList());
    }
}
