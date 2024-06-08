package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.IPlayer;

public class MonsterDefeatedStory extends Story {
    public MonsterDefeatedStory(final IPlayer player) {
        super(
                """
                        You defeated the monster!
                        (You gained 5HP)""",
                ">",
                "",
                "",
                "",
                player
        );
    }

    @Override
    public int getHpVariation() {
        return 5;
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
