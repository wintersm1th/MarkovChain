package org.z7.graphs_simplified.vertices.intf;

import org.z7.graphs_simplified.vertices.intf.Vertex;

public interface ContentVertex<C> extends Vertex {
    C getContent();

    void setContent(C content);
}
