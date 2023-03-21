package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.edges.intf.Edge;
import org.z7.graphs_simplified.graphs.intf.Graph;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GraphImpl<V extends Vertex, E extends Edge<V>>
        implements Graph<V, E> {

    protected final Map<V, List<E>> transitions = new HashMap<>();

    @Override
    public void addVertex(V vertex) {
        transitions.put(vertex, new ArrayList<>());
    }

    @Override
    public void addEdge(E edge) {
        V first = edge.getEnds().getFirst();
        V second = edge.getEnds().getSecond();

        transitions.get(first).add(edge);
        transitions.get(second).add(edge);
    }

    @Override
    public List<V> getTransitionsFrom(V vertex) {
        return transitions.get(vertex).stream().map(Edge::getEnds).map((vertices) -> {
            V result;
            if (vertex == vertices.getFirst()) {
                result = vertices.getSecond();
            } else {
                result = vertices.getFirst();
            }
            return result;
        }).collect(Collectors.toList());
    }
}
