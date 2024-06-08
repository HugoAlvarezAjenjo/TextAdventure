package es.hugoalvarezajenjo.textadventure.model.stories;

import es.hugoalvarezajenjo.textadventure.model.IPlayer;
import es.hugoalvarezajenjo.textadventure.model.monsters.Goblin;
import es.hugoalvarezajenjo.textadventure.model.monsters.Monster;

public class MonsterStory extends Story {
    private final Monster monster;
    private boolean isFirstEncounter;

    public MonsterStory(IPlayer player) {
        super(
                "You encountered a Monster!",
                "Fight",
                "Run",
                "",
                "",
                player
        );
        this.monster = new Goblin();
        this.isFirstEncounter = true;
    }

    @Override
    public int getHpVariation() {
        if (this.isFirstEncounter || this.monster.getHp() <= 0) {
            return 0;
        } else {
            return -this.monster.getAttack();
        }
    }

    @Override
    protected Story choice1() {
        this.monster.setHp(this.monster.getHp() - this.getPlayerWeapon().getDamage());
        this.isFirstEncounter = false;
        if (this.monster.getHp() <= 0) {
            return new MonsterDefeatedStory(this.getPlayer());
        } else {
            return this;
        }
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
