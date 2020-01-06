package stonehearth.impl.card;

import card.Card;

import java.util.Objects;

public abstract class StonehearthCard implements Card {

    private final int manaCost;
    private final String name;
    private final String description;

    protected StonehearthCard(final int manaCost, final String name, final String description) {
        this.manaCost = manaCost;
        this.name = name;
        this.description = description;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StonehearthCard that = (StonehearthCard) o;
        return manaCost == that.manaCost &&
                name.equals(that.name) &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manaCost, name, description);
    }
}
