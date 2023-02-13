package org.z7.markov_new.support.selector;

import org.z7.markov_new.intf.RandomSelector;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGenerator;

public class RandomSelectorImpl implements RandomSelector {
    private final RandomGenerator generator = new Random();
    @Override
    public <C> ProbableChoice<C> choiceFrom(List<ProbableChoice<C>> choices) {
        assert !Objects.isNull(choices);
        assert choices.size() > 0;

        float rolled = generator.nextFloat(0, 1);

        ProbableChoice<C> result = null;

        for (ProbableChoice<C> optionalChoice : choices) {
            rolled -= optionalChoice.getProbability();
            if (rolled <= 0) {
                result = optionalChoice;
                break;
            }
        }

        assert !Objects.isNull(result);

        return result;
    }
}
