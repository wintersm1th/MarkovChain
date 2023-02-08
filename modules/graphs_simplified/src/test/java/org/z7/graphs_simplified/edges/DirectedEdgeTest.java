package org.z7.graphs_simplified.edges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.VertexImpl;

class DirectedEdgeTest {
    @Test
    void transitionEndsTest() {
        VertexImpl from = new VertexImpl();
        VertexImpl to = new VertexImpl();

        DirectedEdgeImpl<VertexImpl> t = new DirectedEdgeImpl<>(from, to);

        Assertions.assertSame(from, t.getFrom());
        Assertions.assertSame(to, t.getTo());
    }
}
