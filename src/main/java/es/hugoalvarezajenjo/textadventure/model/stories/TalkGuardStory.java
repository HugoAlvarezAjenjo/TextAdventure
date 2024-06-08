package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;

public class TalkGuardStory extends Story {

    public TalkGuardStory(Player player) {
        super(
                "Guard: Hello stranger. I have never seen your face.\n" +
                        "I'm sorry but we cannot let a stranger enter to our town",
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
}
