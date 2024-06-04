package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.logic.PlayerManager;

public class ChoiceScreenController {
    private final ChoiceScreen choiceScreen;
    private final PlayerManager playerManager;

    public ChoiceScreenController(ChoiceScreen choiceScreen, PlayerManager playerManager) {
        this.choiceScreen = choiceScreen;
        this.playerManager = playerManager;

        this.updateHp();
        this.updateWeaponName();
    }

    public void updateHp() {
        this.choiceScreen.setHp(this.playerManager.getHp());
    }

    public void updateWeaponName() {
        this.choiceScreen.setWeaponName(this.playerManager.getWeaponName());
    }
}
