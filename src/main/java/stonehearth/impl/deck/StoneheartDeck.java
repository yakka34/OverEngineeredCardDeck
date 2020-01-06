package stonehearth.impl.deck;

import deck.Deck;
import stonehearth.impl.card.StonehearthCard;

import java.util.LinkedHashSet;

/**
 * In Stonehearth, deck is the same thing as player's hand, there are no cards waiting to be drawn, hence the no duplicates rule.
 * Cards can only be gained by discarding (playing) other cards.
 */
public class StoneheartDeck<T extends StonehearthCard> implements Deck<T> {

    // Stonehearth doesn't allow duplicate cards in the deck
    private final LinkedHashSet<T> cards;

    public StoneheartDeck(final LinkedHashSet<T> cards) {
        this.cards = cards;
    }

    public boolean add(final T card) {
        return this.cards.add(card);
    }

    public boolean remove(final T card) {
        return this.cards.remove(card);
    }

    @Override
    public LinkedHashSet<T> getCards() {
        return cards;
    }
}
