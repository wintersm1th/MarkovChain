package org.z7.graphs;

import java.util.List;

public interface VertexPillar<C, THIS extends VertexPillar<C, THIS>> {
    public List<THIS> getAdjacent();

    public void bindGraph(Graph<THIS, ? extends Transition<THIS>> g);
}
