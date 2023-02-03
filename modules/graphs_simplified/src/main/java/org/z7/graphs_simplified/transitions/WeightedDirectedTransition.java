package org.z7.graphs_simplified.transitions;

import org.z7.graphs_simplified.DirectedTransition;
import org.z7.graphs_simplified.Vertex;
import org.z7.graphs_simplified.WeightedTransition;
import org.z7.graphs_simplified.transitions.support.AbstractTransition;
import org.z7.graphs_simplified.transitions.support.DirectedTransitionSupport;

public class WeightedDirectedTransition<V extends Vertex, W>
        extends DirectedTransitionSupport<V>
        implements DirectedTransition<V>, WeightedTransition<W> {
    W weight;

    public WeightedDirectedTransition(V from, V to, W weight) {
        super(from, to);
        this.weight = weight;
    }

    public W getWeight() {
        return weight;
    }
}
