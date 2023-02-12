package org.z7.markov_new.support.selector;

import java.util.List;

public interface RandomSelector {
    ProbableChoice<?> choiceFrom(List<ProbableChoice<?>> choices);
}
