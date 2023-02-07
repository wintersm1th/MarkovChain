package org.z7.graphs_simplified.transitions;

import org.z7.graphs_simplified.UndirectedTransition;
import org.z7.graphs_simplified.Vertex;
import org.z7.graphs_simplified.WeightedTransition;
import org.z7.graphs_simplified.transitions.support.UndirectedTransitionSupport;

public class WeightedUndirectedTransition<V extends Vertex, W>
        extends UndirectedTransitionSupport<V>
        implements UndirectedTransition<V>, WeightedTransition<W> {
    public WeightedUndirectedTransition(V from, V to) {
        super(from, to);
    }

    @Override
    public W getWeight() {
        return null;
    }
}
