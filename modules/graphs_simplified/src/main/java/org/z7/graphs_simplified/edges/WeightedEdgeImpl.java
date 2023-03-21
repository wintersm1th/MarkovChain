package org.z7.graphs_simplified.edges;

import org.z7.graphs_simplified.edges.intf.WeightedEdge;
import org.z7.graphs_simplified.vertices.intf.Vertex;

public class WeightedEdgeImpl<V extends Vertex, W>
        extends EdgeImpl<V>
        implements WeightedEdge<V, W> {

    private final W weight;

    public WeightedEdgeImpl(V first, V second, W weight) {
        super(first, second);

        this.weight = weight;
    }

    @Override
    public W getWeight() {
        return weight;
    }
}
