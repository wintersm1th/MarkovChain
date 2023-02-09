package org.z7.graphs_simplified.edges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.VertexImpl;

class WeightedDirectedEdgeTest {
    @Test
    void weightTest() {
        VertexImpl from = new VertexImpl();
        VertexImpl to = new VertexImpl();

        Integer integerWeight = 100;
        String stringWeight = "weight";

        WeightedDirectedEdgeImpl<VertexImpl, Integer> integerTransition = new WeightedDirectedEdgeImpl<>(from, to, integerWeight);
        WeightedDirectedEdgeImpl<VertexImpl, String> stringTransition = new WeightedDirectedEdgeImpl<>(from, to, stringWeight);

        Assertions.assertSame(integerWeight, integerTransition.getWeight());
        Assertions.assertSame(stringWeight, stringTransition.getWeight());
    }

    @Test
    void transitionEdgesTest() {
        VertexImpl from = new VertexImpl();
        VertexImpl to = new VertexImpl();

        WeightedDirectedEdgeImpl<VertexImpl, Integer> t = new WeightedDirectedEdgeImpl<>(from, to, 0);

        Assertions.assertSame(from, t.getFrom());
        Assertions.assertSame(to, t.getTo());
    }
}
