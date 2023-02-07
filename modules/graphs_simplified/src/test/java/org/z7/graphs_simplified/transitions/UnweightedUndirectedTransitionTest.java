package org.z7.graphs_simplified.transitions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.SimpleVertex;

class UnweightedUndirectedTransitionTest {
    @Test
    void transitionEndsTest() {
        SimpleVertex from = new SimpleVertex();
        SimpleVertex to = new SimpleVertex();

        UnweightedUndirectedTransition<SimpleVertex> t = new UnweightedUndirectedTransition<>(from, to);

        Assertions.assertTrue(Utils.isInPair(t.getVertices(), from));
        Assertions.assertTrue(Utils.isInPair(t.getVertices(), to));
    }
}
