package org.z7.graphs_simplified.edges;

import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;
import org.z7.graphs_simplified.vertices.intf.Vertex;

public class WeightedDirectedEdgeImpl<V extends Vertex, W>
        extends DirectedEdgeImpl<V>
        implements WeightedDirectedEdge<V, W> {

    private final W weight;

    public WeightedDirectedEdgeImpl(V from, V to, W weight) {
        super(from, to);

        this.weight = weight;
    }

    @Override
    public W getWeight() {
        return weight;
    }
}
