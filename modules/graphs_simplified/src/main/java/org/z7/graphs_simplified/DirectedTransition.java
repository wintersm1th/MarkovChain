package org.z7.graphs_simplified;

public interface DirectedTransition<V extends Vertex> extends Transition<V> {
    V getFrom();

    V getTo();
}
