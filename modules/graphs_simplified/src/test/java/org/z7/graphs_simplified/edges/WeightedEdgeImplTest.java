package org.z7.graphs_simplified.edges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.VertexImpl;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.z7.graphs_simplified.edges.support.Utils.isInPair;

class WeightedEdgeImplTest {
    @Test
    void integerWeightTest() {
        VertexImpl from = new VertexImpl();
        VertexImpl to = new VertexImpl();
        Integer weight = 100;

        WeightedEdgeImpl<VertexImpl, Integer> t = new WeightedEdgeImpl<>(from, to, weight);

        Assertions.assertEquals(weight, t.getWeight());
    }

    @Test
    void transitionEndsTest() {
        VertexImpl from = new VertexImpl();
        VertexImpl to = new VertexImpl();

        WeightedEdgeImpl<VertexImpl, Integer> t = new WeightedEdgeImpl<>(from, to, 0);

        assertTrue(isInPair(t.getEnds(), from));
        assertTrue(isInPair(t.getEnds(), to));
    }
}
