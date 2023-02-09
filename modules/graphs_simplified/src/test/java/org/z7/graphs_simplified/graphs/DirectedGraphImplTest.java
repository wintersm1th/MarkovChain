package org.z7.graphs_simplified.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.edges.DirectedEdgeImpl;
import org.z7.graphs_simplified.vertices.VertexImpl;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;

class DirectedGraphImplTest {
    private DirectedGraphImpl<VertexImpl, DirectedEdgeImpl<VertexImpl>> g;

    @BeforeEach
    void resetGraph() {
        g = new DirectedGraphImpl<>();
    }

    @Test
    void signeVertexTest() {
        VertexImpl start = new VertexImpl();

        g.addVertex(start);

        List<? extends Vertex> adjacentVertices = g.getTransitionsFrom(start);

        Assertions.assertNotNull(adjacentVertices);
        Assertions.assertEquals(0, adjacentVertices.size());
    }

    @Test
    void twoVerticesTest() {
        VertexImpl start = new VertexImpl();
        VertexImpl finish = new VertexImpl();

        g.addVertex(start);
        g.addVertex(finish);

        g.getTransitionsFrom(start);
        g.getTransitionsFrom(finish);

        g.addEdge(new DirectedEdgeImpl<>(start, finish));

        List<? extends Vertex> startAdjacent = g.getTransitionsFrom(start);
        List<? extends Vertex> finishAdjacent = g.getTransitionsFrom(finish);

        Assertions.assertNotNull(startAdjacent);
        Assertions.assertSame(finish, startAdjacent.get(0));

        Assertions.assertNotNull(finishAdjacent);
        Assertions.assertEquals(0, finishAdjacent.size());
    }
}
