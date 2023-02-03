package org.z7.graphs.transitions;

import org.z7.graphs.SimpleVertexPillar;

public class WeightedTransition<V extends SimpleVertexPillar<?, V>, W> extends AbstractTransition<V> {
    private final W weight;

    public WeightedTransition(V from, V to, W weight) {
        super(from, to);
        this.weight  = weight;
    }


    public W getWeight() {
        return weight;
    }
}
