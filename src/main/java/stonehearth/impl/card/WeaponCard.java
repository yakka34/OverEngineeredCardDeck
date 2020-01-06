package stonehearth.impl.card;

import stonehearth.Weapon;

public class WeaponCard extends StonehearthCombatCard implements Weapon {

    public WeaponCard(final int manaCost, final String name, final String description, final int attackDamage, final int endurance) {
        super(manaCost, name, description, attackDamage, endurance);
    }

}
