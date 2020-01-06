package deck.impl;

import card.Card;
import deck.Deck;

import java.util.ArrayList;
import java.util.List;

/**
 * Deck implementation using stack data model First-in, last-out (FILO).
 * Once the deck has been constructed removals and additions will only affect top of the deck
 */
public class StackDeck<E extends Card> implements Deck<E> {

    private final ArrayList<E> cards;

    public StackDeck(final ArrayList<E> cards) {
        this.cards = cards;
    }

    public boolean push(final E card) {
        return cards.add(card);
    }

    public E pop() {
        return cards.remove(cards.size() - 1);
    }

    public E peek() {
        return cards.get(cards.size() - 1);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int size() {
        return cards.size();
    }

    @Override
    public List<E> getCards() {
        return cards;
    }
}
