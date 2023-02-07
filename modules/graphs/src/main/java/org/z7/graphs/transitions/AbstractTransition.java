package org.z7.graphs.transitions;

import org.z7.graphs.Transition;
import org.z7.graphs.VertexPillar;

public class AbstractTransition<V extends VertexPillar<?, ?>> implements Transition<V> {
    private final V from;

    private final V to;

    AbstractTransition(V from, V to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public V getFrom() {
        return this.from;
    }

    @Override
    public V getTo() {
        return this.to;
    }
}
