package org.z7.graphs;

import java.util.List;

abstract public class SimpleVertexPillar<C, THIS extends SimpleVertexPillar<C, THIS>> implements VertexPillar<C, THIS> {
    protected Graph<THIS, ? extends Transition<THIS>> graph;

    private C content;

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }

    public void bindGraph(Graph<THIS, ? extends Transition<THIS>> graph) {
        this.graph = graph;
    }

    public List<THIS> getAdjacent() {
        return this.graph.getAdjacentFor((THIS) this);
    }
}
