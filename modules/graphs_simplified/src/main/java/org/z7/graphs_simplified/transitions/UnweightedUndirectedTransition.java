package org.z7.graphs_simplified.transitions;

import org.z7.graphs_simplified.UndirectedTransition;
import org.z7.graphs_simplified.Vertex;
import org.z7.graphs_simplified.transitions.support.UndirectedTransitionSupport;

public class UnweightedUndirectedTransition<V extends Vertex>
        extends UndirectedTransitionSupport<V>
        implements UndirectedTransition<V> {
    public UnweightedUndirectedTransition(V from, V to) {
        super(from, to);
    }
}
