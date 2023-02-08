package org.z7.graphs_simplified.edges;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.edges.intf.WeightedEdge;

public class WeightedEdgeImpl<V extends Vertex, W>
        extends EdgeImpl<V>
        implements WeightedEdge<V, W> {

    private W weight;

    WeightedEdgeImpl(V first, V second, W weight) {
        super(first, second);

        this.weight = weight;
    }

    @Override
    public W getWeight() {
        return weight;
    }
}
