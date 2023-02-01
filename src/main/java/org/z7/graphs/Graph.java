package org.z7.graphs;

import java.util.List;

public interface Graph<V extends VertexPillar<?, V>, T extends Transition<V>> {
    V createVertex();

    void addTransition(T transition);

    void removeTransition(T transition);

    List<V> getAdjacentFor(V vertex);
}
