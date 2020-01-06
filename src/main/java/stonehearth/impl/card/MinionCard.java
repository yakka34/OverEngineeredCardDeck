package stonehearth.impl.card;

import stonehearth.Minion;

import java.util.Objects;

public class MinionCard extends StonehearthCombatCard implements Minion<StonehearthMinionType> {

    private final StonehearthMinionType minionType;

    public MinionCard(final int manaCost, final String name, final String description, final int attackDamage, final int endurance, final StonehearthMinionType minionType) {
        super(manaCost, name, description, attackDamage, endurance);
        this.minionType = minionType;
    }

    @Override
    public StonehearthMinionType getMinionType() {
        return minionType;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final MinionCard that = (MinionCard) o;
        return minionType == that.minionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minionType);
    }
}
