package org.z7.graphs_simple.vertices;

public interface ContentVertex<C> extends Vertex {
    C getContent();
    void setContent(C content);
}
