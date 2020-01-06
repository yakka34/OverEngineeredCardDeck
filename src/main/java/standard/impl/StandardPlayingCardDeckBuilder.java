package standard.impl;

import deck.impl.BaseDeckBuilder;
import deck.impl.StackDeck;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static standard.impl.StandardPlayingCardRank.*;
import static standard.impl.StandardPlayingCardSuit.*;

public class StandardPlayingCardDeckBuilder extends BaseDeckBuilder<StandardPlayingCardDeckBuilder, StandardPlayingCard, StackDeck<StandardPlayingCard>> {

    private static final EnumSet<StandardPlayingCardSuit> standardPlayingCardSuits = EnumSet.of(CLUB, DIAMOND, HEARTH, SPADE);
    private static final EnumSet<StandardPlayingCardRank> standardPlayingCardRanks = EnumSet.of(ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING);

    @Override
    protected StandardPlayingCardDeckBuilder getThis() {
        return this;
    }

    public StandardPlayingCardDeckBuilder standardCardDeck() {
        final List<StandardPlayingCard> playingCards = new ArrayList<>();
        standardPlayingCardSuits.iterator().forEachRemaining(suit -> {
            standardPlayingCardRanks.iterator().forEachRemaining(rank -> {
                playingCards.add(new StandardPlayingCard(suit, rank));
            });
        });
        return cards(playingCards);
    }

    public StandardPlayingCardDeckBuilder standardCardDeckWithWilds() {
        return standardCardDeck()
                .joker()
                .joker();
    }

    public StandardPlayingCardDeckBuilder joker() {
        return card(new StandardPlayingCard(WILD, JOKER));
    }

    @Override
    public StackDeck<StandardPlayingCard> build() {
        return new StackDeck<>(cards);
    }

}


