package org.z7.graphs_simplified.edges.support;

import org.z7.util.Pair;

public class Utils {
    public static <T> boolean isInPair(Pair<T, T> pair, T obj) {
        return obj == pair.getFirst() || obj == pair.getSecond();
    }
}
