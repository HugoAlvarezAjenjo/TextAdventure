package es.hugoalvarezajenjo.textadventure.model.stories;

public class CrossTheRoadStory extends Story {
    public CrossTheRoadStory() {
        super(
                """
                        You are at the crossroad.
                        If you go south, you will return to the town""",
                "Go north",
                "Go east",
                "Go south",
                "Go west"
        );
    }

    @Override
    protected Story choice1() {
        return new RiverStory();
    }

    @Override
    protected Story choice2() {
        return new ForestStory();
    }

    @Override
    protected Story choice3() {
        return new TownStory();
    }

    @Override
    protected Story choice4() {
        return null;
    }
}
