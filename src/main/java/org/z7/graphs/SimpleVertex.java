package org.z7.graphs;

import java.util.List;

public class SimpleVertex<C> extends SimpleVertexPillar<C, SimpleVertex<C>> {
    public List<SimpleVertex<C>> getAdjacent() {
        return this.graph.getAdjacentFor(this);
    }
}
