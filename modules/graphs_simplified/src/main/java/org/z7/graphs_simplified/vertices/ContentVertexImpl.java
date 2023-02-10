package org.z7.graphs_simplified.vertices;

import org.z7.graphs_simplified.vertices.intf.ContentVertex;

public class ContentVertexImpl<C> extends AbstractVertex implements ContentVertex<C> {
    C content;

    public ContentVertexImpl() { }

    public ContentVertexImpl(C content) {
        this.content = content;
    }

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }
}
