package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.WindowScreen;

public class ChoiceScreen extends WindowScreen {
    public ChoiceScreen() {
        this.add(new ChoiceButtonPanel());
        this.add(new MainTextPanel());
        this.add(new PlayerInfoPanel());
    }
}
