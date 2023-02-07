package org.z7.graphs_simplified.transitions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.SimpleVertex;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.z7.graphs_simplified.transitions.Utils.isInPair;

class WeightedUndirectedTransitionTest {
    @Test
    void integerWeightTest() {
        SimpleVertex from = new SimpleVertex();
        SimpleVertex to = new SimpleVertex();
        Integer weight = 100;

        WeightedUndirectedTransition<SimpleVertex, Integer> t = new WeightedUndirectedTransition<>(from, to, weight);

        Assertions.assertEquals(weight, t.getWeight());
    }

    @Test
    void transitionEndsTest() {
        SimpleVertex from = new SimpleVertex();
        SimpleVertex to = new SimpleVertex();

        WeightedUndirectedTransition<SimpleVertex, Integer> t = new WeightedUndirectedTransition<>(from, to, 0);

        assertTrue(isInPair(t.getVertices(), from));
        assertTrue(isInPair(t.getVertices(), to));
    }
}
