package org.z7.graphs_simplified.edges;

import org.z7.graphs_simplified.edges.intf.Edge;
import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.util.Pair;

public class EdgeImpl<V extends Vertex> implements Edge<V> {
    Pair<V, V> vertices;

    public EdgeImpl(V first, V second) {
        this.vertices = new Pair<>(first, second);
    }

    @Override
    public Pair<V, V> getEnds() {
        return vertices;
    }
}
