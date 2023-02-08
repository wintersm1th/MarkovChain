package org.z7.graphs_simplified.graphs.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.edges.intf.Edge;

import java.util.List;

public interface Graph<V extends Vertex, E extends Edge<V>> {
    void addVertex(V vertex);

    void addEdge(E edge);

    List<V> getTransitionsFrom(V vertex);
}
