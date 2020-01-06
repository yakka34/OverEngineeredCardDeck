package stonehearth.impl.deck;

import org.junit.jupiter.api.Test;
import stonehearth.impl.card.*;

import static org.junit.jupiter.api.Assertions.*;

class StonehearthCardDeckBuilderTest {

    @Test
    void testMinion() {
        final MinionCard minion = new MinionCard(5, "Minion", "Fights for your", 2, 3, StonehearthMinionType.GENERAL);
        final StoneheartDeck<StonehearthCard> deck = new StonehearthCardDeckBuilder()
                .minion(5, "Minion", "Fights for your", 2, 3, StonehearthMinionType.GENERAL)
                .build();

        assertEquals(1, deck.getCards().size());
        assertTrue(deck.getCards().contains(minion));
    }

    @Test
    void testSpell() {
        final SpellCard spell = new SpellCard(5, "Spell", "Magic and stuff");
        final StoneheartDeck<StonehearthCard> deck = new StonehearthCardDeckBuilder()
                .spell(5, "Spell", "Magic and stuff")
                .build();

        assertEquals(1, deck.getCards().size());
        assertTrue(deck.getCards().contains(spell));
    }

    @Test
    void testWeapon() {
        final WeaponCard weapon = new WeaponCard(5, "Weapon", "Slashes and hurts", 3, 2);
        final StoneheartDeck<StonehearthCard> deck = new StonehearthCardDeckBuilder()
                .weapon(5, "Weapon", "Slashes and hurts", 3, 2)
                .build();

        assertEquals(1, deck.getCards().size());
        assertTrue(deck.getCards().contains(weapon));
    }

    @Test
    void testHero() {
        final HeroCard hero = new HeroCard(5, "Hero", "Saves the day", 6);
        final StoneheartDeck<StonehearthCard> deck = new StonehearthCardDeckBuilder()
                .hero(5, "Hero", "Saves the day",6)
                .build();

        assertEquals(1, deck.getCards().size());
        assertTrue(deck.getCards().contains(hero));
    }

    @Test
    void testNoDuplicates() {
        final StoneheartDeck<StonehearthCard> deck = new StonehearthCardDeckBuilder()
                .minion(5, "Minion", "Fights for your", 2, 3, StonehearthMinionType.GENERAL)
                .minion(5, "Minion", "Fights for your", 2, 3, StonehearthMinionType.GENERAL)
                .spell(5, "Spell", "Magic and stuff")
                .spell(5, "Spell", "Magic and stuff")
                .weapon(5, "Weapon", "Slashes and hurts", 3, 2)
                .weapon(5, "Weapon", "Slashes and hurts", 3, 2)
                .hero(5, "Hero", "Saves the day",6)
                .hero(5, "Hero", "Saves the day",6)
                .build();

        assertEquals(4, deck.getCards().size());
    }
}