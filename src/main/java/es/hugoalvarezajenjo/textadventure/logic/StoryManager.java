package es.hugoalvarezajenjo.textadventure.logic;

import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;
import es.hugoalvarezajenjo.textadventure.model.stories.Story;
import es.hugoalvarezajenjo.textadventure.model.stories.TownStory;

public class StoryManager {
    private final PlayerManager playerManager;
    private Story story;

    public StoryManager(final PlayerManager playerManager) {
        this.story = new TownStory();
        this.playerManager = playerManager;
    }

    public String getStoryTitle() {
        return this.story.getName();
    }

    public String[] getStoryChoices() {
        return this.story.getChoices();
    }

    public boolean makeChoice(final String choice) {
        if (choice.isEmpty()) {
            return false;
        }
        final Story nextStory = this.story.makeChoice(choice);
        if (nextStory != null) {
            this.story = nextStory;
            this.playerManager.variatePlayerHp(nextStory.getHpVariation());
            final Weapon weaponToChange = nextStory.getWeaponVariation();
            if (weaponToChange != null) {
                this.playerManager.setPlayerWeapon(weaponToChange);
            }
            return true;
        }
        return false;
    }
}
