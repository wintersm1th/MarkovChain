package org.z7.graphs_simplified.edges;

import org.z7.graphs_simplified.edges.intf.DirectedEdge;
import org.z7.graphs_simplified.vertices.intf.Vertex;

public class DirectedEdgeImpl<V extends Vertex>
        extends EdgeImpl<V>
        implements DirectedEdge<V> {

    public DirectedEdgeImpl(V from, V to) {
        super(from, to);
    }

    @Override
    public V getFrom() {
        return vertices.getFirst();
    }

    @Override
    public V getTo() {
        return vertices.getSecond();
    }
}
