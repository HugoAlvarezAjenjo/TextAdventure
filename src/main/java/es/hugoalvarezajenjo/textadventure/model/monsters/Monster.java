package es.hugoalvarezajenjo.textadventure.model.monsters;

public class Monster {
    private String name;
    private int hp;
    private int attack;

    public Monster(final String name, final int hp, final int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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

    public void setAttack(final int attack) {
        this.attack = attack;
    }
}
