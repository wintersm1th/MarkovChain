package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.edges.intf.WeightedEdge;
import org.z7.graphs_simplified.graphs.intf.WeightedDirectedGraph;
import org.z7.graphs_simplified.graphs.intf.WeightedGraph;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;
import java.util.stream.Collectors;

public class WeightedGraphImpl<V extends Vertex, W, E extends WeightedEdge<V, W>>
        extends GraphImpl<V, E>
        implements WeightedGraph<V, W, E> {

    @Override
    public List<WeightedDirectedGraph.WeightedTransition<V, W>> getWeightedTransitionsFrom(V vertex) {
        return transitions.get(vertex).stream().map((edge) -> {
            V first = edge.getEnds().getFirst();
            V second = edge.getEnds().getSecond();
            V to = first == vertex ? second : first;
            W weight = edge.getWeight();
            return new WeightedDirectedGraph.WeightedTransition<>(to, weight);
        }).collect(Collectors.toList());
    }
}
