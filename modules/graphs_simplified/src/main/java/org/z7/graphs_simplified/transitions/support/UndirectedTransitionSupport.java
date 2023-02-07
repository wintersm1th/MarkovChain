package org.z7.graphs_simplified.transitions.support;

import org.z7.graphs_simplified.UndirectedTransition;
import org.z7.graphs_simplified.Vertex;
import org.z7.util.Pair;

public class UndirectedTransitionSupport<V extends Vertex>
        extends AbstractTransition<V>
        implements UndirectedTransition<V> {

    public UndirectedTransitionSupport(V from, V to) {
        super(from, to);
    }

    @Override
    public Pair<V, V> getVertices() {
        return vertices;
    }
}
