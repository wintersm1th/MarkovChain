package org.z7.graphs_simplified;

import org.z7.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UndirectedGraph<V extends Vertex, E extends UndirectedTransition<V>> extends AbstractGraph<V, E> {
    private final HashMap<V, ArrayList<V>> transitions = new HashMap<>();

    @Override
    public void addVertex(V vertex) {
        transitions.put(vertex, new ArrayList<>());
    }

    @Override
    public void addTransition(E transition) {
        Pair<V, V> ends = transition.getVertices();

        V firstEnd = ends.getFirst();
        V secondEnd = ends.getSecond();

        transitions.get(firstEnd).add(secondEnd);
        transitions.get(secondEnd).add(firstEnd);
    }

    @Override
    public List<V> getAdjacentFor(V target) {
        return transitions.get(target);
    }

}
