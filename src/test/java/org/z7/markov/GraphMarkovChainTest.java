package org.z7.markov;

import org.junit.jupiter.api.Test;

public class GraphMarkovChainTest {
    @Test
    public void emptyChainTest() {
        GraphMarkovChain<String> chain = new GraphMarkovChain<>();
        GraphMarkovState<String> firstState = chain.createState("Hello");
    }
}
