package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.Player;

public class TownStory extends Story {
    public TownStory(Player player) {
        super(
                """
                        You are at the gate of the town.
                        A Guard is standing in front of you.
                        What do you do?""",
                "Talk to the guard",
                "Attack the guard",
                "Leave",
                "",
                player
        );

    }

    @Override
    protected Story choice1() {
        return new TalkGuardStory(this.getPlayer());
    }

    @Override
    protected Story choice2() {
        return new AttackGuardStory(this.getPlayer());
    }

    @Override
    protected Story choice3() {
        return new CrossTheRoadStory(this.getPlayer());
    }

    @Override
    protected Story choice4() {
        return null;
    }
}
