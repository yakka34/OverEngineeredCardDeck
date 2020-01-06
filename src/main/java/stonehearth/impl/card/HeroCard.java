package stonehearth.impl.card;

import stonehearth.Hero;

import java.util.Objects;

public class HeroCard extends StonehearthCard implements Hero {

    private final int armor;

    public HeroCard(final int manaCost, final String name, final String description, final int armor) {
        super(manaCost, name, description);
        this.armor = armor;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) return false;
        final HeroCard heroCard = (HeroCard) o;
        return armor == heroCard.armor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), armor);
    }
}
