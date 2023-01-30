package org.z7.graphs;

public class Vertex<C> {
    private Graph graph;

    private C content;

    Vertex(Graph parent) {
        this.graph = parent;
    }

    Vertex(C content) {
        this.content = content;
    }

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }
}
