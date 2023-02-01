package org.z7.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.z7.graphs.transitions.SimpleTransition;

public class VertexPillarsTest {
    static private class NumericVertexPillar<THIS extends NumericVertexPillar<THIS>> extends SimpleVertexPillar<Integer, THIS> {
        Integer doubledValue() {
            return this.getContent() * 2;
        }
    }

    static private class NumericVertex extends NumericVertexPillar<NumericVertex> {

    }

    static private class NumericVertexFactory implements VertexFactory<NumericVertex> {
        public NumericVertex create() {
            return new NumericVertex();
        }
    }

    @Test
    void numericVertexTest() {
        NumericVertexFactory vertexFactory = new NumericVertexFactory();

        DirectedGraph<NumericVertex, SimpleTransition<NumericVertex>> g = new DirectedGraph<>(vertexFactory);

        NumericVertex start = g.createVertex();
        NumericVertex end = g.createVertex();
        start.setContent(100);
        end.setContent(1000);

        g.addTransition(new SimpleTransition<>(start, end));

        var actualValue = start.getAdjacent().get(0).doubledValue();
        Assertions.assertEquals(2000, actualValue);

    }
}
