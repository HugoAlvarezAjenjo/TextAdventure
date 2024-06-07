package es.hugoalvarezajenjo.textadventure.model;

import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;

public class Player {
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
		this.hp = hp;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(final Weapon weapon) {
		this.weapon = weapon;
	}


}
