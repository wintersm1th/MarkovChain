package org.z7.graphs_simplified.transitions;

import org.z7.graphs_simplified.DirectedTransition;
import org.z7.graphs_simplified.Vertex;
import org.z7.graphs_simplified.transitions.support.DirectedTransitionSupport;

public class UnweightedDirectedTransition<V extends Vertex>
        extends DirectedTransitionSupport<V>
        implements DirectedTransition<V> {
    public UnweightedDirectedTransition(V from, V to) {
        super(from, to);
    }
}
