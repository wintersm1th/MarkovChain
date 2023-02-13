package org.z7.markov_new.support;

import org.junit.jupiter.api.ClassOrderer;
import org.z7.markov_new.intf.RandomSelector;
import org.z7.markov_new.support.selector.ProbableChoice;

import java.util.List;

public class MockRandomSelector implements RandomSelector {
    @Override
    public <C> ProbableChoice<C> choiceFrom(List<ProbableChoice<C>> choices) {
        return choices.get(0);
    }
}
