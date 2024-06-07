package es.hugoalvarezajenjo.textadventure.model.stories;

public class RiverStory extends Story {
    public RiverStory() {
        super(
                """
                        There is a river.
                        You drink the water and rest at this riverside
                        (Your HP has recovered by 2)""",
        "Go south",
        "",
        "",
        ""
        );
    }

    @Override
    public int getHpVariation() {
        return 2;
    }

    @Override
    protected Story choice1() {
        return new CrossTheRoadStory();
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
