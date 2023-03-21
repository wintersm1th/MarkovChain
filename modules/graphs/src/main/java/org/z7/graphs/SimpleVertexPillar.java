package org.z7.graphs;

import java.util.List;

abstract public class SimpleVertexPillar<C, CONCRETE extends SimpleVertexPillar<C, CONCRETE>> implements VertexPillar<C, CONCRETE> {
    protected Graph<CONCRETE, ? extends Transition<CONCRETE>> graph;

    private C content;

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }

    public void bindGraph(Graph<CONCRETE, ? extends Transition<CONCRETE>> graph) {
        this.graph = graph;
    }

    public List<CONCRETE> getAdjacent() {
        return this.graph.getAdjacentFor((CONCRETE) this);
    }
}
