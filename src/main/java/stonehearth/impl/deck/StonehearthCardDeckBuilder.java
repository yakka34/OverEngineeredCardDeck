package stonehearth.impl.deck;

import deck.impl.BaseDeckBuilder;
import stonehearth.impl.card.StonehearthMinionType;
import stonehearth.impl.card.*;

import java.util.*;

public class StonehearthCardDeckBuilder extends BaseDeckBuilder<StonehearthCardDeckBuilder, StonehearthCard, StoneheartDeck<StonehearthCard>> {

    @Override
    protected StonehearthCardDeckBuilder getThis() {
        return this;
    }

    public StonehearthCardDeckBuilder minion(
            final int manaCost, final String name, final String description,
            final int attackDamage, final int endurance, final StonehearthMinionType minionType) {
        return card(new MinionCard(manaCost, name, description, attackDamage, endurance, minionType));
    }

    public StonehearthCardDeckBuilder spell(final int manaCost, final String name, final String description) {
        return card(new SpellCard(manaCost, name, description));
    }

    public StonehearthCardDeckBuilder weapon(final int manaCost, final String name, final String description, final int attackDamage, final int endurance) {
        return card(new WeaponCard(manaCost, name, description, attackDamage, endurance));
    }

    public StonehearthCardDeckBuilder hero(final int manaCost, final String name, final String description, final int armor) {
        return card(new HeroCard(manaCost, name, description, armor));
    }

    @Override
    public StoneheartDeck<StonehearthCard> build() {
        return new StoneheartDeck<>(new LinkedHashSet<>(cards));
    }

}


