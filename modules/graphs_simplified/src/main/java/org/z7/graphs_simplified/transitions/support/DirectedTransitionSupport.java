package org.z7.graphs_simplified.transitions.support;

import org.z7.graphs_simplified.Vertex;

public class DirectedTransitionSupport<V extends Vertex>
        extends AbstractTransition<V>
        implements org.z7.graphs_simplified.DirectedTransition<V> {
    public DirectedTransitionSupport(V from, V to) {
        super(from, to);
    }

    @Override
    public V getFrom() {
        return vertices.getFirst();
    }

    @Override
    public V getTo() {
        return vertices.getSecond();
    }
}
