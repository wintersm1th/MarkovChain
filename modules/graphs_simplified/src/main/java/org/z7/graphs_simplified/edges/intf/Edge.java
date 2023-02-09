package org.z7.graphs_simplified.edges.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.util.Pair;

public interface Edge<V extends Vertex> {
    Pair<V, V> getEnds();
}
