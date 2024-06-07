package es.hugoalvarezajenjo.textadventure.model.stories;

public class TalkGuardStory extends Story {

    public TalkGuardStory() {
        super(
                "Guard: Hello stranger. I have never seen your face.\n" +
                        "I'm sorry but we cannot let a stranger enter to our town",
                ">",
                "",
                "",
                ""
        );
    }

    @Override
    protected Story choice1() {
        return new TownStory();
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
