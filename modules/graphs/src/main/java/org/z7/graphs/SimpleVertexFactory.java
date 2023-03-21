package org.z7.graphs;

public class SimpleVertexFactory<C> implements VertexFactory<SimpleVertex<C>> {
    @Override
    public SimpleVertex<C> create() {
        return new SimpleVertex<C>();
    }
}
