package org.z7.graphs_simple.vertices;

public class WeightedDirectedTransitionImpl<V extends Vertex, W> extends AbstractTransition<V> implements WeightedDirectedTransition<V, W> {
    W weight;

    public WeightedDirectedTransitionImpl(V from, V to, W weight) {
        super(from, to);
        this.weight = weight;
    }

    public W getWeight() {
        return weight;
    }

    public V getFrom() {
        return vertices.getFirst();
    }

    public V getTo() {
        return vertices.getSecond();
    }
}
