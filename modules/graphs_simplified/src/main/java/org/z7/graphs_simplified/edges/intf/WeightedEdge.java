package org.z7.graphs_simplified.edges.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;
import org.z7.graphs_simplified.edges.intf.support.Weighted;

public interface WeightedEdge<V extends Vertex, W> extends Edge<V>, Weighted<W> {
}
