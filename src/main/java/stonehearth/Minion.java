package stonehearth;

public interface Minion<T extends MinionType> extends CardType {

    T getMinionType();

}
