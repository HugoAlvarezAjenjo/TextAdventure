package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.IPlayer;
import es.hugoalvarezajenjo.textadventure.model.monsters.Goblin;
import es.hugoalvarezajenjo.textadventure.model.monsters.Monster;

public class MonsterStory extends Story {
    private final Monster monster = new Goblin();

    public MonsterStory(IPlayer player) {
        super(
                "You encountered a Monster!",
                "Fight",
                "Run",
                "",
                "",
                player
        );
    }

    @Override
    public int getHpVariation() {
        return -this.monster.getAttack();
    }

    @Override
    protected Story choice1() {
        this.monster.setHp(this.monster.getHp() - this.getPlayerWeapon().getDamage());
        return null;
    }

    @Override
    protected Story choice2() {
        return new CrossTheRoadStory(this.getPlayer());
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
