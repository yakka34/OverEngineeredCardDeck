package stonehearth.impl.card;

import stonehearth.Combat;
import stonehearth.impl.card.StonehearthCard;

import java.util.Objects;

public abstract class StonehearthCombatCard extends StonehearthCard implements Combat {

    private final int attackDamage;
    private final int endurance;

    protected StonehearthCombatCard(final int manaCost, final String name, final String description, final int attackDamage, final int endurance) {
        super(manaCost, name, description);
        this.attackDamage = attackDamage;
        this.endurance = endurance;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getEndurance() {
        return endurance;
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
        final StonehearthCombatCard that = (StonehearthCombatCard) o;
        return attackDamage == that.attackDamage &&
                endurance == that.endurance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), attackDamage, endurance);
    }
}
