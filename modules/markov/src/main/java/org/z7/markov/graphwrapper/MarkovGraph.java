package org.z7.markov.graphwrapper;

import org.z7.graphs.DirectedGraph;
import org.z7.graphs.VertexFactory;

public class MarkovGraph<C> extends DirectedGraph<MarkovVertex<C>, MarkovTransition<C>> {
    public MarkovGraph(VertexFactory<MarkovVertex<C>> vertexFactory) {
        super(vertexFactory);
    }
}
