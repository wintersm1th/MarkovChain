package org.z7.markov_new.support.selector;

public class ProbableChoice<C> {
    private final float probability;

    private final C content;

    public ProbableChoice(float probability, C content) {
        this.probability = probability;
        this.content = content;
    }

    public float getProbability() {
        return probability;
    }

    public C getContent() {
        return content;
    }
}
