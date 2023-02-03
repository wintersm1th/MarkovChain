package org.z7.graphs_simplified;

import org.z7.graphs_simplified.Vertex;

public interface ContentVertex<C> extends Vertex {
    C getContent();
    void setContent(C content);
}
