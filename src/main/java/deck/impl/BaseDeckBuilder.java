package deck.impl;

import card.Card;
import deck.Deck;

import java.util.ArrayList;
import java.util.List;


public abstract class BaseDeckBuilder<T extends BaseDeckBuilder<T, E, K>, E extends Card, K extends Deck<E>> {

    protected final ArrayList<E> cards;

    public BaseDeckBuilder() {
        this.cards = new ArrayList<>();
    }

    /**
     * Used to avoid "Unchecked cast"-warning when returning generic self-reference eg. return (T) this
     */
    protected abstract T getThis();

    protected T card(final E card) {
        this.cards.add(card);
        return getThis();
    }

    protected T cards(final List<E> cards) {
        this.cards.addAll(cards);
        return getThis();
    }

    public abstract K build();

}
