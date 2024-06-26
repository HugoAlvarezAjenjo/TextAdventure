package es.hugoalvarezajenjo.textadventure.model;

public class Monster {
    private final String name;
    private int hp;
    private final int attack;

    public Monster(final String name, final int hp, final int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }
}
