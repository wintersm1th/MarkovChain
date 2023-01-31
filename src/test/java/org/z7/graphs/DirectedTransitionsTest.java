package org.z7.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.z7.graphs.transitions.SimpleTransition;

public class DirectedTransitionsTest {
    @Test
    public void adjacentNotNullTest() {
        SimpleVertexFactory<Integer> vertexFactory = new SimpleVertexFactory<>();

        DirectedGraph<SimpleVertex<Integer>, Transition<SimpleVertex<Integer>>> g = new DirectedGraph<>(vertexFactory);

        SimpleVertex<Integer> start = g.createVertex();

        Assertions.assertNotNull(start.getAdjacent());
    }

    @Test
    public void singleTransitionTest() {
        SimpleVertexFactory<Integer> vertexFactory = new SimpleVertexFactory<>();

        DirectedGraph<SimpleVertex<Integer>, Transition<SimpleVertex<Integer>>> g = new DirectedGraph<>(vertexFactory);

        SimpleVertex<Integer> begin = g.createVertex();
        SimpleVertex<Integer> end = g.createVertex();

        g.addTransition(new SimpleTransition<>(begin, end));

        Assertions.assertEquals(1, begin.getAdjacent().size());
        Assertions.assertEquals(begin.getAdjacent().get(0), end);
    }
}
