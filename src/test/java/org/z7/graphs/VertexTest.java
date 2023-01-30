package org.z7.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;
class VertexTest {

    @Test
    public void contentTest() {
        Graph g = new DirectedGraph<Integer, Integer>();

        Vertex<Integer> v = g.createVertex();

        Integer initialContent = 20;

        v.setContent(initialContent);

        Integer content = v.getContent();

        Assertions.assertEquals(content, initialContent);
    }
}