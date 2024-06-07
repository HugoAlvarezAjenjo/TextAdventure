package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.IPlayer;

public class AttackGuardStory extends Story {
    public AttackGuardStory(IPlayer player) {
        super(
                """
                        Guard: Hey don't be stupid!
                        The guard attacked you so hard and you gave up.
                        (You receive 3 damage)""",
                ">",
                "",
                "",
                "",
                player
        );
    }

    @Override
    protected Story choice1() {
        return new TownStory(this.getPlayer());
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

    @Override
    public int getHpVariation() {
        return -3;
    }
}
