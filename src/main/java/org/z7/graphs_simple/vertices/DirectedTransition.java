package org.z7.graphs_simple.vertices;

interface DirectedTransition<V extends Vertex> extends Transition<V> {
    V getFrom();
    V getTo();
}
