package standard.impl;

import deck.impl.StackDeck;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static standard.impl.StandardPlayingCardRank.*;
import static standard.impl.StandardPlayingCardSuit.*;
import static standard.impl.StandardPlayingCardSuit.SPADE;

class StandardPlayingCardDeckBuilderTest {

    private static final EnumSet<StandardPlayingCardSuit> standardPlayingCardSuits = EnumSet.of(CLUB, DIAMOND, HEARTH, SPADE);
    private static final EnumSet<StandardPlayingCardRank> standardPlayingCardRanks = EnumSet.of(ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING);

    @Test
    void testStandardDeck() {
        final StackDeck<StandardPlayingCard> deck = new StandardPlayingCardDeckBuilder().standardCardDeck().build();

        assertEquals(52, deck.size());

        final List<StandardPlayingCard> actualCards = deck.getCards();
        final List<StandardPlayingCard> expectedCards = new ArrayList<>();

        standardPlayingCardSuits.forEach(suit -> {
            standardPlayingCardRanks.forEach(rank -> {
                expectedCards.add(new StandardPlayingCard(suit, rank));
            });
        });

        assertEquals(52, expectedCards.size());
        assertIterableEquals(expectedCards, actualCards);
    }

    @Test
    void testStandardDeckWithWilds() {
        final StackDeck<StandardPlayingCard> deck = new StandardPlayingCardDeckBuilder().standardCardDeckWithWilds().build();

        assertEquals(54, deck.size());

        final List<StandardPlayingCard> actualCards = deck.getCards();
        final List<StandardPlayingCard> expectedCards = new ArrayList<>();

        standardPlayingCardSuits.forEach(suit -> {
            standardPlayingCardRanks.forEach(rank -> {
                expectedCards.add(new StandardPlayingCard(suit, rank));
            });
        });
        expectedCards.add(new StandardPlayingCard(WILD, JOKER));
        expectedCards.add(new StandardPlayingCard(WILD, JOKER));

        assertEquals(54, expectedCards.size());
        assertIterableEquals(expectedCards, actualCards);
    }
}