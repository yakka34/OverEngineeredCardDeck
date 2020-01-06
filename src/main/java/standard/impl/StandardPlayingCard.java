package standard.impl;

import standard.PlayingCard;

import java.util.Objects;

public class StandardPlayingCard implements PlayingCard<StandardPlayingCardSuit, StandardPlayingCardRank> {

    private final StandardPlayingCardSuit suit;
    private final StandardPlayingCardRank rank;

    public StandardPlayingCard(final StandardPlayingCardSuit suit, final StandardPlayingCardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public StandardPlayingCardSuit getSuit() {
        return suit;
    }

    @Override
    public StandardPlayingCardRank getRank() {
        return rank;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StandardPlayingCard that = (StandardPlayingCard) o;
        return suit == that.suit &&
                rank == that.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
