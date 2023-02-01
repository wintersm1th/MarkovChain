package org.z7.graphs;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.z7.graphs.transitions.SimpleTransition;

public class DirectedGraphTest {
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

    @Test
    public void transitionChainTest() {
        SimpleVertexFactory<String> vertexFactory = new SimpleVertexFactory<>();

        DirectedGraph<SimpleVertex<String>, SimpleTransition<SimpleVertex<String>>> g = new DirectedGraph<>(vertexFactory);

        SimpleVertex<String> first = g.createVertex();
        SimpleVertex<String> second = g.createVertex();
        SimpleVertex<String> third = g.createVertex();

        g.addTransition(new SimpleTransition<>(first, second));
        g.addTransition(new SimpleTransition<>(second, third));
        g.addTransition(new SimpleTransition<>(third, first));

        List<? extends SimpleVertex<?>> firstAdjacentExpected = Collections.singletonList(second);
        List<? extends SimpleVertex<?>> secondAdjacentExpected = Collections.singletonList(third);
        List<? extends SimpleVertex<?>> thirdAdjacentExpected = Collections.singletonList(first);

        List<? extends SimpleVertex<?>> firstAdjacent = first.getAdjacent();
        List<? extends SimpleVertex<?>> secondAdjacent = second.getAdjacent();
        List<? extends SimpleVertex<?>> thirdAdjacent = third.getAdjacent();

        Assertions.assertIterableEquals(firstAdjacentExpected, firstAdjacent);
        Assertions.assertIterableEquals(secondAdjacentExpected, secondAdjacent);
        Assertions.assertIterableEquals(thirdAdjacentExpected, thirdAdjacent);
    }
}
