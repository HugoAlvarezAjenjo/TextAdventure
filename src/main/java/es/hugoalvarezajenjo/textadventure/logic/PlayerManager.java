package es.hugoalvarezajenjo.textadventure.logic;

import es.hugoalvarezajenjo.textadventure.model.IPlayer;
import es.hugoalvarezajenjo.textadventure.model.weapons.Knife;
import es.hugoalvarezajenjo.textadventure.model.Player;
import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;

public class PlayerManager {
    private final Player player;

    public PlayerManager() {
        this.player = new Player(10, new Knife());
    }

    public String getPlayerWeaponName() {
        return this.player.getWeapon().getName();
    }

    public IPlayer getPlayer() {
        return this.player;
    }

    public int getPlayerHp() {
        return this.player.getHp();
    }

    public void variatePlayerHp(final int hp) {
        this.player.setHp(this.player.getHp() + hp);
    }

    public void setPlayerWeapon(final Weapon weapon) {
        this.player.setWeapon(weapon);
    }
}
