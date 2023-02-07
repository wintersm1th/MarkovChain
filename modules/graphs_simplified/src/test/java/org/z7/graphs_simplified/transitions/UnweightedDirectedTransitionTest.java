package org.z7.graphs_simplified.transitions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.vertices.SimpleVertex;

class UnweightedDirectedTransitionTest {
    @Test
    void transitionEndsTest() {
        SimpleVertex from = new SimpleVertex();
        SimpleVertex to = new SimpleVertex();

        UnweightedDirectedTransition<SimpleVertex> t = new UnweightedDirectedTransition<>(from, to);

        Assertions.assertSame(from, t.getFrom());
        Assertions.assertSame(to, t.getTo());
    }
}
