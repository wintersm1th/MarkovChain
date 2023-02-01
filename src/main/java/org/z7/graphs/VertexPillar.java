package org.z7.graphs;

import java.util.List;

public interface VertexPillar<C, CONCRETE extends VertexPillar<C, CONCRETE>> {
    public List<CONCRETE> getAdjacent();

    public void bindGraph(Graph<CONCRETE, ? extends Transition<CONCRETE>> g);
}
