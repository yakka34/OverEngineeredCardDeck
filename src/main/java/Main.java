import standard.impl.StandardPlayingCard;
import deck.impl.StackDeck;
import standard.impl.StandardPlayingCardDeckBuilder;
import stonehearth.impl.deck.StoneheartDeck;
import stonehearth.impl.card.StonehearthCard;
import stonehearth.impl.deck.StonehearthCardDeckBuilder;
import stonehearth.impl.card.StonehearthMinionType;

public class Main {

    /*  todo one deck to fit them all

        deck seed based shuffling
        interfaces -> annotations
        tests
     */

    public static void main(final String[] args) {
        System.out.println("Hello world");
        final StackDeck<StandardPlayingCard> build = new StandardPlayingCardDeckBuilder().standardCardDeck().build();
        final StackDeck<StandardPlayingCard> build2 = new StandardPlayingCardDeckBuilder().standardCardDeckWithWilds().build();

        final StoneheartDeck<StonehearthCard> stoneBuild = new StonehearthCardDeckBuilder()
                .minion(1, "Minion", "Minion", 2, 3, StonehearthMinionType.GENERAL)
                .spell(6, "Spell", "Does magic")
                .weapon(3, "Sword", "Slashes and hurts", 3, 2)
                .hero(8, "Hero", "Saves the day", 8)
                .build();
    }
}
