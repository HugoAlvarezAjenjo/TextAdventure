package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;
import es.hugoalvarezajenjo.textadventure.model.weapons.LongSword;
import es.hugoalvarezajenjo.textadventure.model.weapons.Weapon;

public class ForestStory extends Story {

    public ForestStory(Player player) {
        super(
                """
                        You walked into a forest and found a Long Sword
                        (You obtained a Long Sword)""",
                "Go west",
                "",
                "",
                "",
                player
        );
    }

    @Override
    public Weapon getWeaponVariation() {
        return new LongSword();
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
