package es.hugoalvarezajenjo.textadventure.model.stories;

public class AttackGuardStory extends Story{
    public AttackGuardStory () {
        super(
                """
                        Guard: Hey don't be stupid!
                        The guard attacked you so hard and you gave up.
                        (You receive 3 damage)""",
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
