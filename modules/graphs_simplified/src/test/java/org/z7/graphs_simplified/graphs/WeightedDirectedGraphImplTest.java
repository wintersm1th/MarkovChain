package org.z7.graphs_simplified.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.edges.WeightedDirectedEdgeImpl;
import org.z7.graphs_simplified.graphs.intf.WeightedDirectedGraph;
import org.z7.graphs_simplified.vertices.VertexImpl;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;

class WeightedDirectedGraphImplTest {

    WeightedDirectedGraphImpl<VertexImpl, Integer, WeightedDirectedEdgeImpl<VertexImpl, Integer>> g;

    @BeforeEach
    void resetGraph() {
        g = new WeightedDirectedGraphImpl<>();
    }

    @Test
    void singleVertexTest() {
        VertexImpl vertex = new VertexImpl();

        g.addVertex(vertex);
        List<? extends Vertex> adjacent = g.getTransitionsFrom(vertex);

        List<WeightedDirectedGraph.WeightedTransition<VertexImpl, Integer>> weightedTransitions = g.getWeightedTransitionsFrom(vertex);

        Assertions.assertNotNull(adjacent);
        Assertions.assertNotNull(weightedTransitions);

        Assertions.assertEquals(0, adjacent.size());
        Assertions.assertEquals(0, weightedTransitions.size());
    }

    @Test
    void twoVerticesTest() {
        VertexImpl start = new VertexImpl();
        VertexImpl finish = new VertexImpl();

        g.addVertex(start);
        g.addVertex(finish);

        Integer weight = 100;
        g.addEdge(new WeightedDirectedEdgeImpl<>(start, finish, weight));

        List<WeightedDirectedGraph.WeightedTransition<VertexImpl, Integer>> startWeightedTransitions = g.getWeightedTransitionsFrom(start);
        List<WeightedDirectedGraph.WeightedTransition<VertexImpl, Integer>> finishWeightedTransitions = g.getWeightedTransitionsFrom(finish);

        Assertions.assertNotNull(startWeightedTransitions);
        Assertions.assertEquals(1, startWeightedTransitions.size());
        Assertions.assertEquals(weight, startWeightedTransitions.get(0).weight());
        Assertions.assertSame(finish, startWeightedTransitions.get(0).target());

        Assertions.assertNotNull(finishWeightedTransitions);
        Assertions.assertEquals(0, finishWeightedTransitions.size());
    }
}
