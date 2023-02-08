package org.z7.graphs_simplified.graphs;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.graphs.intf.Graph;
import org.z7.graphs_simplified.edges.intf.Edge;

import java.util.List;

public class GraphImpl<V extends Vertex, E extends Edge<V>>
        implements Graph<V, E> {
    @Override
    public void addEdge(E edge) {

    }

    @Override
    public List<V> getTransitionsFrom(V vertex) {
        return null;
    }
}
