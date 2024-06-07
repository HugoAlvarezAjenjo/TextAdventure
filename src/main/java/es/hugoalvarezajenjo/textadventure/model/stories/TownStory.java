package es.hugoalvarezajenjo.textadventure.model.stories;

public class TownStory extends Story {
    public TownStory() {
        super(
                """
                        You are at the gate of the town.
                        A Guard is standing in front of you.
                        What do you do?""",
                "Talk to the guard",
                "Attack the guard",
                "Leave",
                ""
        );

    }

    @Override
    protected Story choice1() {
        return new TalkGuardStory();
    }

    @Override
    protected Story choice2() {
        return new AttackGuardStory();
    }

    @Override
    protected Story choice3() {
        return new CrossTheRoadStory();
    }

    @Override
    protected Story choice4() {
        return null;
    }
}
