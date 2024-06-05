package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.WindowScreen;

import java.awt.event.ActionListener;

public class ChoiceScreen extends WindowScreen {
    private final ChoiceButtonPanel choiceButtonPanel;
    private final MainTextPanel mainTextPanel;
    private final PlayerInfoPanel playerInfoPanel;

    public ChoiceScreen(final ActionListener choiceButtonListener) {
        this.choiceButtonPanel = new ChoiceButtonPanel(choiceButtonListener);
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

    public void setMainText(final String storyTitle) {
        this.mainTextPanel.setText(storyTitle);
    }

    public void setStoryChoices(final String[] storyChoices) {
        this.choiceButtonPanel.setStoryChoices(storyChoices);
    }
}
