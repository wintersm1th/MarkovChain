package org.z7.graphs;

public interface Graph<C, T extends Transition> {
    Vertex<C> createVertex();

    void addTransition(Transition transition);

    void removeTransition(Transition transition);
}
