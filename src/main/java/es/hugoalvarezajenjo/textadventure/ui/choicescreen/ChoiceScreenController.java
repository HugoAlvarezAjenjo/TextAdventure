package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.logic.PlayerManager;
import es.hugoalvarezajenjo.textadventure.logic.StoryManager;

public class ChoiceScreenController {
    private final ChoiceScreen choiceScreen;
    private final PlayerManager playerManager;
    private final StoryManager storyManager;

    public ChoiceScreenController(final ChoiceScreen choiceScreen, final PlayerManager playerManager, final StoryManager storyManager) {
        this.choiceScreen = choiceScreen;
        this.playerManager = playerManager;
        this.storyManager = storyManager;

        this.updateHp();
        this.updateWeaponName();
        this.updateStoryTitle();
        this.updateStoryChoices();
    }

    private void updateHp() {
        this.choiceScreen.setHp(this.playerManager.getHp());
    }

    private void updateWeaponName() {
        this.choiceScreen.setWeaponName(this.playerManager.getWeaponName());
    }

    private void updateStoryTitle() {
        this.choiceScreen.setMainText(this.storyManager.getStoryTitle());
    }

    private void updateStoryChoices() {
        this.choiceScreen.setStoryChoices(this.storyManager.getStoryChoices());
    }

    private void updateStory() {
        this.updateStoryTitle();
        this.updateStoryChoices();
    }

    public void selectOption1() {

    }

    public void selectOption2() {

    }

    public void selectOption3() {

    }

    public void selectOption4() {

    }
}
