package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;
import es.hugoalvarezajenjo.textadventure.model.Weapon;

public class ForestStory extends Story {

    public ForestStory(final Player player) {
        super(
                """
                        You walked into a forest and found a Long Sword
                        (You obtained a Long Sword)""",
                "Go west",
                "",
                "",
                "",
                player);
    }

    @Override
    public Weapon getWeaponVariation() {
        return new Weapon("Long Sword", 10);
    }

    @Override
    protected Story choice1() {
        return new CrossTheRoadStory(this.getPlayer());
    }

    @Override
    protected Story choice2() {
        return null;
    }

    @Override
    protected Story choice3() {
        return null;
    }

    @Override
    protected Story choice4() {
        return null;
    }
}
