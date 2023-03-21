package org.z7.graphs_simplified.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.z7.graphs_simplified.edges.WeightedEdgeImpl;
import org.z7.graphs_simplified.edges.intf.WeightedEdge;
import org.z7.graphs_simplified.graphs.intf.WeightedDirectedGraph;
import org.z7.graphs_simplified.vertices.VertexImpl;
import org.z7.graphs_simplified.vertices.intf.Vertex;

import java.util.List;

class WeightedGraphImplTest {


    private WeightedGraphImpl<VertexImpl, Integer, WeightedEdge<VertexImpl, Integer>> g;

    @BeforeEach
    void resetGraph() {
        g = new WeightedGraphImpl<>();
    }

    @Test
    void singleVertexTest() {
        VertexImpl begin = new VertexImpl();

        g.addVertex(begin);

        List<? extends Vertex> transitions = g.getTransitionsFrom(begin);

        Assertions.assertNotNull(transitions);
        Assertions.assertEquals(0, transitions.size());

        List<WeightedDirectedGraph.WeightedTransition<VertexImpl, Integer>> weightedTransitions = g.getWeightedTransitionsFrom(begin);

        Assertions.assertNotNull(weightedTransitions);
        Assertions.assertEquals(0, weightedTransitions.size());
    }

    @Test
    void twoVerticesTest() {
        VertexImpl start = new VertexImpl();
        VertexImpl finish = new VertexImpl();

        g.addVertex(start);
        g.addVertex(finish);

        Integer weight = 100;
        g.addEdge(new WeightedEdgeImpl<>(start, finish, weight));

        List<WeightedDirectedGraph.WeightedTransition<VertexImpl, Integer>> startWeightedTransitions = g.getWeightedTransitionsFrom(start);
        List<WeightedDirectedGraph.WeightedTransition<VertexImpl, Integer>> finishWeightedTransitions = g.getWeightedTransitionsFrom(finish);

        Assertions.assertNotNull(startWeightedTransitions);
        Assertions.assertEquals(1, startWeightedTransitions.size());
        Assertions.assertEquals(weight, startWeightedTransitions.get(0).weight());
        Assertions.assertSame(finish, startWeightedTransitions.get(0).target());

        Assertions.assertNotNull(finishWeightedTransitions);
        Assertions.assertEquals(1, finishWeightedTransitions.size());
        Assertions.assertEquals(weight, finishWeightedTransitions.get(0).weight());
        Assertions.assertSame(start, finishWeightedTransitions.get(0).target());
    }
}
