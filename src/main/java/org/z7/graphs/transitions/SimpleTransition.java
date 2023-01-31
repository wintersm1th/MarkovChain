package org.z7.graphs.transitions;

import org.z7.graphs.Transition;
import org.z7.graphs.Vertex;
import org.z7.graphs.VertexPillar;

public class SimpleTransition<V extends VertexPillar<?, ?>> extends AbstractTransition<V> {
    public SimpleTransition(V from, V to) {
        super(from, to);
    }
}
