package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;
import org.z7.graphs_simplified.graphs.intf.WeightedDirectedGraph;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;
import java.util.stream.Collectors;

public class WeightedDirectedGraphImpl<V extends Vertex, W, E extends WeightedDirectedEdge<V, W>>
        extends DirectedGraphImpl<V, E>
        implements WeightedDirectedGraph<V, W, E> {
    @Override
    public List<WeightedTransition<V, W>> getWeightedTransitionsFrom(V vertex) {
        return transitions.get(vertex).stream().map((edge) -> {
            V to = edge.getTo();
            W weight = edge.getWeight();
            return new WeightedTransition<>(to, weight);
        }).collect(Collectors.toList());
    }
}
