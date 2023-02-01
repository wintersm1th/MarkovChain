package org.z7.graphs;

public interface Transition<V extends VertexPillar<?, ?>> {
    V getFrom();

    V getTo();
}
