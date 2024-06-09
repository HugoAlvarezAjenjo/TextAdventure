package es.hugoalvarezajenjo.textadventure.model.weapons;

public abstract class Weapon implements IWeapon {
    private final String name;
    private final int damage;

    public Weapon(final String name, final int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
