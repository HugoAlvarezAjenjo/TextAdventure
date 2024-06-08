package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.logic.PlayerManager;
import es.hugoalvarezajenjo.textadventure.logic.StoryManager;
import es.hugoalvarezajenjo.textadventure.ui.MainWindowController;

public class ChoiceScreenController {
    private final ChoiceScreen choiceScreen;
    private final PlayerManager playerManager;
    private final StoryManager storyManager;
    private final MainWindowController controller;

    public ChoiceScreenController(final ChoiceScreen choiceScreen, final PlayerManager playerManager, final StoryManager storyManager, final MainWindowController controller) {
        this.choiceScreen = choiceScreen;
        this.playerManager = playerManager;
        this.storyManager = storyManager;
        this.controller = controller;

        this.updateHp();
        this.updateWeaponName();
        this.updateStoryTitle();
        this.updateStoryChoices();
    }

    private void updateHp() {
        this.choiceScreen.setHp(this.playerManager.getPlayerHp());
    }

    private void updateWeaponName() {
        this.choiceScreen.setWeaponName(this.playerManager.getPlayerWeaponName());
    }

    private void updateStoryTitle() {
        this.choiceScreen.setMainText(this.storyManager.getStoryTitle());
    }

    private void updateStoryChoices() {
        this.choiceScreen.setStoryChoices(this.storyManager.getStoryChoices());
    }

    private void updateView() {
        this.updateStoryTitle();
        this.updateStoryChoices();
        this.updateHp();
        this.updateWeaponName();
    }

    public void notifyChoice(final String choice) {
        final boolean needsUpdate = this.storyManager.makeChoice(choice);
        if (this.playerManager.isGameOver()) {
            this.controller.showEndScreen();
        } else {
            if (needsUpdate) {
                this.updateView();
            }
        }
    }

}
