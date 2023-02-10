package org.z7.markov_new;

import org.z7.markov_new.intf.MarkovState;

public class MarkovStateImpl<C> implements MarkovState<C> {
    private C content;

    MarkovStateImpl(C content) {
        this.content = content;
    }

    @Override
    public C getContent() {
        return content;
    }

    @Override
    public void setContent(C newContent) {
        content = newContent;
    }
}
