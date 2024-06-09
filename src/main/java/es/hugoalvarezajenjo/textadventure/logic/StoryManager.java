package es.hugoalvarezajenjo.textadventure.logic;

import es.hugoalvarezajenjo.textadventure.model.Player;
import es.hugoalvarezajenjo.textadventure.model.stories.Story;
import es.hugoalvarezajenjo.textadventure.model.stories.TownStory;
import es.hugoalvarezajenjo.textadventure.model.weapons.Knife;
import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;

public class StoryManager {
    private final Player player;
    private Story story;

    public StoryManager() {
        this.player = new Player(10, new Knife());
        this.story = new TownStory(this.getPlayer());
    }

    public String getStoryTitle() {
        return this.story.getName();
    }

    public String[] getStoryChoices() {
        return this.story.getChoices();
    }

    public int getPlayerHp() {
        return this.getPlayer().getHp();
    }

    public String getPlayerWeaponName() {
        return this.getPlayer().getWeapon().getName();
    }

    public boolean makeChoice(final String choice) {
        if (choice.isEmpty()) {
            return false;
        }
        final Story nextStory = this.story.makeChoice(choice);
        if (nextStory != null) {
            this.story = nextStory;
            this.getPlayer().variateHp(nextStory.getHpVariation());
            final Weapon weaponToChange = nextStory.getWeaponVariation();
            if (weaponToChange != null) {
                this.getPlayer().setWeapon(weaponToChange);
            }
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        return this.getPlayer().getHp() <= 0;
    }

    private Player getPlayer() {
        return this.player;
    }
}
