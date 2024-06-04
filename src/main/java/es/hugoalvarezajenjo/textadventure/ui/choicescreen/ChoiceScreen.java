package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.WindowScreen;

public class ChoiceScreen extends WindowScreen {
    private final ChoiceButtonPanel choiceButtonPanel;
    private final MainTextPanel mainTextPanel;
    private final PlayerInfoPanel playerInfoPanel;

    public ChoiceScreen() {
        this.choiceButtonPanel = new ChoiceButtonPanel();
        this.mainTextPanel = new MainTextPanel();
        this.playerInfoPanel = new PlayerInfoPanel();
        this.add(this.choiceButtonPanel);
        this.add(this.mainTextPanel);
        this.add(this.playerInfoPanel);
    }

    public void setHp(int hp) {
        this.playerInfoPanel.setHp(hp);
    }

    public void setWeaponName(final String weaponName) {
        this.playerInfoPanel.setWeaponName(weaponName);
    }
}
