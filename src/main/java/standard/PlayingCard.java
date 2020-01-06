package standard;

import card.Card;

public interface PlayingCard<T extends CardSuit, V extends CardRank> extends Card {

    T getSuit();

    V getRank();

}
