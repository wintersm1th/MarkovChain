package org.z7.graphs_simplified;

public interface ContentVertex<C> extends Vertex {
    C getContent();

    void setContent(C content);
}
