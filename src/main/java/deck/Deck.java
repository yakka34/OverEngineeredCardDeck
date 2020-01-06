package deck;

import card.Card;

import java.util.Collection;


public interface Deck<E extends Card> {

    Collection<E> getCards();

}
