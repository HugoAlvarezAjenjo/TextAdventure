package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import es.hugoalvarezajenjo.textadventure.ui.MainWindowController;

public class StartButtonListerner implements ActionListener {
    final MainWindowController mainWindowController;

    public StartButtonListerner(final MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        mainWindowController.showChoiceScreen();
    }
}
