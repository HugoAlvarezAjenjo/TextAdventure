package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;
import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;

public abstract class Story {
    private final Player player;
    private final String storyName;
    private final String storyOption1;
    private final String storyOption2;
    private final String storyOption3;
    private final String storyOption4;

    public Story(
            final String storyName,
            final String storyOption1,
            final String storyOption2,
            final String storyOption3,
            final String storyOption4,
            final Player player) {
        this.player = player;
        this.storyName = storyName;
        this.storyOption1 = storyOption1;
        this.storyOption2 = storyOption2;
        this.storyOption3 = storyOption3;
        this.storyOption4 = storyOption4;
    }

    public String[] getChoices() {
        final String[] choices = new String[4];
        choices[0] = this.storyOption1;
        choices[1] = this.storyOption2;
        choices[2] = this.storyOption3;
        choices[3] = this.storyOption4;
        return choices;
    }

    public String getName() {
        return this.storyName;
    }

    public Story makeChoice(final String choice) {
        Story nextStory = null;
        if (choice.equals(this.storyOption1)) {
            nextStory = this.choice1();
        } else if (choice.equals(this.storyOption2)) {
            nextStory = this.choice2();
        } else if (choice.equals(this.storyOption3)) {
            nextStory = this.choice3();
        } else if (choice.equals(this.storyOption4)) {
            nextStory = this.choice4();
        }
        return nextStory;
    }

    public int getHpVariation() {
        return 0;
    }

    public Weapon getWeaponVariation() {
        return null;
    }

    protected Player getPlayer() {
        return this.player;
    }

    protected Weapon getPlayerWeapon() {
        return this.getPlayer().getWeapon();
    }

    protected abstract Story choice1();

    protected abstract Story choice2();

    protected abstract Story choice3();

    protected abstract Story choice4();
}
