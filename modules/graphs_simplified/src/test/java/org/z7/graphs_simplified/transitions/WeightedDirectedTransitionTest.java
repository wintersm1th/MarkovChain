package org.z7.graphs_simplified.transitions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.SimpleVertex;

class WeightedDirectedTransitionTest {
    @Test
    void weightTest() {
        SimpleVertex from = new SimpleVertex();
        SimpleVertex to = new SimpleVertex();

        Integer integerWeight = 100;
        String stringWeight = "weight";

        WeightedDirectedTransition<SimpleVertex, Integer> integerTransition = new WeightedDirectedTransition<>(from, to, integerWeight);
        WeightedDirectedTransition<SimpleVertex, String> stringTransition = new WeightedDirectedTransition<>(from, to, stringWeight);

        Assertions.assertSame(integerWeight, integerTransition.getWeight());
        Assertions.assertSame(stringWeight, stringTransition.getWeight());
    }

    @Test
    void transitionEdgesTest() {
        SimpleVertex from = new SimpleVertex();
        SimpleVertex to = new SimpleVertex();

        WeightedDirectedTransition<SimpleVertex, Integer> t = new WeightedDirectedTransition<>(from, to, 0);

        Assertions.assertSame(from, t.getFrom());
        Assertions.assertSame(to, t.getTo());
    }
}
