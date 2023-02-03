package org.z7.graphs_simplified.vertices;

public class SimpleContentVertex<C> extends AbstractVertex implements org.z7.graphs_simplified.ContentVertex<C> {
    C content;

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }
}
