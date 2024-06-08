package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;

public class CrossTheRoadStory extends Story {
    public CrossTheRoadStory(Player player) {
        super(
                """
                        You are at the crossroad.
                        If you go south, you will return to the town""",
                "Go north",
                "Go east",
                "Go south",
                "Go west",
                player
        );
    }

    @Override
    protected Story choice1() {
        return new RiverStory(this.getPlayer());
    }

    @Override
    protected Story choice2() {
        return new ForestStory(this.getPlayer());
    }

    @Override
    protected Story choice3() {
        return new TownStory(this.getPlayer());
    }

    @Override
    protected Story choice4() {
        return new MonsterStory(this.getPlayer());
    }
}
