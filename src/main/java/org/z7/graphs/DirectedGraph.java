package org.z7.graphs;

public class DirectedGraph<C, T> implements Graph {
    public Vertex<C> createVertex() {
        return new Vertex(this);
    }

    @Override
    public void addTransition(Transition transition) {

    }

    @Override
    public void removeTransition(Transition transition) {

    }
}
