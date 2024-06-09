package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import java.awt.event.ActionListener;

import es.hugoalvarezajenjo.textadventure.ui.WindowScreen;

public class StartScreen extends WindowScreen {
    public StartScreen(final ActionListener onStartButtonClick) {
        this.add(new TitleNamePanel());
        this.add(new StartButtonPanel(onStartButtonClick));
    }
}
