package org.z7.graphs_simplified.edges;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.edges.intf.WeightedDirectedEdge;

public class WeightedDirectedEdgeImpl<V extends Vertex, W>
        extends DirectedEdgeImpl<V>
        implements WeightedDirectedEdge<V, W> {

    private W weight;

    public WeightedDirectedEdgeImpl(V from, V to, W weight) {
        super(from, to);

        this.weight = weight;
    }

    @Override
    public W getWeight() {
        return weight;
    }
}
