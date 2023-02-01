package org.z7.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.z7.graphs.transitions.WeightedTransition;

class VertexTest {

    @Test
    public void contentTest() {
        SimpleVertexFactory<Integer> vertexFactory = new SimpleVertexFactory<>();
        Graph<SimpleVertex<Integer>, WeightedTransition<SimpleVertex<Integer>, Integer>> g = new DirectedGraph<>(vertexFactory);

        SimpleVertex<Integer> v = g.createVertex();

        Integer initialContent = 20;

        v.setContent(initialContent);

        Integer content = v.getContent();

        Assertions.assertEquals(content, initialContent);
    }
}
