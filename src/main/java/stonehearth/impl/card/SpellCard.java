package stonehearth.impl.card;

import stonehearth.Spell;

public class SpellCard extends StonehearthCard implements Spell {

    public SpellCard(final int manaCost, final String name, final String description) {
        super(manaCost, name, description);
    }

}
