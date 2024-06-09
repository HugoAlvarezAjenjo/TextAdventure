package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;

public class RiverStory extends Story {
    public RiverStory(final Player player) {
        super(
                """
                        There is a river.
                        You drink the water and rest at this riverside
                        (Your HP has recovered by 2)""",
                "Go south",
                "",
                "",
                "",
                player);
    }

    @Override
    public int getHpVariation() {
        return 2;
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
