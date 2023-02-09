package org.z7.graphs_simplified.edges.intf;

import org.z7.graphs_simplified.edges.intf.support.Weighted;
import org.z7.graphs_simplified.vertices.intf.Vertex;

public interface WeightedDirectedEdge<V extends Vertex, W> extends DirectedEdge<V>, Weighted<W> {
}
