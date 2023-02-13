package org.z7.markov_new;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.z7.markov_new.intf.MarkovState;
import org.z7.markov_new.support.MockRandomSelector;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarkovChainImplTest {
    private MarkovChainImpl<String> chain;

    @BeforeEach
    void resetChain() {
        chain = new MarkovChainImpl<>(new MockRandomSelector());
    }

    @Test
    void singleStateChainTest() {
        final String message = "message";
        List<String> expectedChain = Arrays.stream(new String [] { message }).toList();

        MarkovState<String> firstState = chain.createState(message);

        chain.setInitialState(firstState);
        List<String> generatedChain = chain.generateChain(1);

        Assertions.assertIterableEquals(expectedChain, generatedChain);
    }
}