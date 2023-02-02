package org.z7.graphs_simple.vertices;

public abstract class AbstractContentVertex<C> extends AbstractVertex implements ContentVertex<C> {
    C content;

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }
}
