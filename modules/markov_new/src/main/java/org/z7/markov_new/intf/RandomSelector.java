package org.z7.markov_new.intf;

import org.z7.markov_new.support.selector.ProbableChoice;

import java.util.List;

public interface RandomSelector {
    <C> ProbableChoice<C> choiceFrom(List<ProbableChoice<C>> choices);
}
