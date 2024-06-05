package es.hugoalvarezajenjo.textadventure.logic;

import es.hugoalvarezajenjo.textadventure.model.Knife;
import es.hugoalvarezajenjo.textadventure.model.Player;

public class PlayerManager {
    private final Player player;

    public PlayerManager() {
        this.player = new Player(10, new Knife());
    }

    public String getPlayerWeaponName() {
        return this.player.getWeapon().getName();
    }

    public int getPlayerHp() {
        return this.player.getHp();
    }
}
