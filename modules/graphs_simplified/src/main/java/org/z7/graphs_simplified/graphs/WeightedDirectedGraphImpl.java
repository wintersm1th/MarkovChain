package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.graphs.intf.WeightedDirectedGraph;
import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;

import java.util.List;

public class WeightedDirectedGraphImpl<V extends Vertex, W, E extends WeightedDirectedEdge<V, W>>
        extends DirectedGraphImpl<V, E>
        implements WeightedDirectedGraph<V, W, E> {
    @Override
    public List<WeightedTransition<V, W>> getWeightedTransitionsFrom(Vertex vertex) {
        return null;
    }
}
