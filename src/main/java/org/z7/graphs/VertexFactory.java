package org.z7.graphs;

public interface VertexFactory<V extends VertexPillar<?, V>> {
    V create();
}
