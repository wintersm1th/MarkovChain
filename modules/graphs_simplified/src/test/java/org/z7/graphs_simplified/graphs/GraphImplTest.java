package org.z7.graphs_simplified.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.edges.EdgeImpl;
import org.z7.graphs_simplified.vertices.VertexImpl;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphImplTest {
    private GraphImpl<VertexImpl, EdgeImpl<VertexImpl>> g;

    @BeforeEach
    public void beforeEach() {
        g = new GraphImpl<>();
    }

    @Test
    void singleVertexTest() {
        VertexImpl begin = new VertexImpl();

        g.addVertex(new VertexImpl());
        List<? extends Vertex> transitions = g.getTransitionsFrom(begin);

        Assertions.assertNotNull(transitions);
        Assertions.assertEquals(0, transitions.size());
    }

    @Test
    void twoVerticesTest() {
        VertexImpl first = new VertexImpl();
        VertexImpl second = new VertexImpl();

        g.addVertex(first);
        g.addVertex(second);

        List<? extends Vertex> firstAdjacent = g.getTransitionsFrom(first);

        Assertions.assertNotNull(firstAdjacent);
        Assertions.assertSame(second, firstAdjacent.get(0));

        List<? extends Vertex> secondAdjacent = g.getTransitionsFrom(second);

        Assertions.assertNotNull(secondAdjacent);
        Assertions.assertSame(first, secondAdjacent.get(0));
    }
}
