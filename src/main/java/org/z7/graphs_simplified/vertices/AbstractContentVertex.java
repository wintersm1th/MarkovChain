package org.z7.graphs_simplified.vertices;

import org.z7.graphs_simplified.ContentVertex;

public abstract class AbstractContentVertex<C> extends AbstractVertex implements ContentVertex<C> {
    C content;

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }
}
