package org.z7.graphs_simplified.edges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.edges.support.Utils;
import org.z7.graphs_simplified.vertices.VertexImpl;

class EdgeTest {
    @Test
    void transitionEndsTest() {
        VertexImpl from = new VertexImpl();
        VertexImpl to = new VertexImpl();

        EdgeImpl<VertexImpl> t = new EdgeImpl<>(from, to);

        Assertions.assertTrue(Utils.isInPair(t.getEnds(), from));
        Assertions.assertTrue(Utils.isInPair(t.getEnds(), to));
    }
}
