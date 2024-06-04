package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import es.hugoalvarezajenjo.textadventure.ui.WindowScreen;

import java.awt.event.ActionListener;

public class StartScreen extends WindowScreen {
    public StartScreen(final ActionListener onStartButtonClick) {
        this.add(new TitleNamePanel());
        this.add(new StartButtonPanel(onStartButtonClick));
    }
}
