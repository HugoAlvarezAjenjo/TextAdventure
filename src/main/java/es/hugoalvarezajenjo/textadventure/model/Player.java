package es.hugoalvarezajenjo.textadventure.model;

import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;

public class Player implements IPlayer{
    private int hp;
    private Weapon weapon;

    public Player(final int hp, final Weapon weapon) {
        this.hp = hp;
        this.weapon = weapon;
    }

	public int getHp() {
		return hp;
	}

	public void setHp(final int hp) {
		this.hp = Math.min(hp, 10);
	}

	public void variateHp(final int hp) {
		this.setHp(this.getHp() + hp);
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(final Weapon weapon) {
		this.weapon = weapon;
	}
}
