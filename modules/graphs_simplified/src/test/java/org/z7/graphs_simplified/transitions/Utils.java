package org.z7.graphs_simplified.transitions;

import org.z7.util.Pair;

public class Utils {

    static <T> boolean isInPair(Pair<T, T> pair, T obj) {
        return obj == pair.getFirst() || obj == pair.getSecond();
    }
}
