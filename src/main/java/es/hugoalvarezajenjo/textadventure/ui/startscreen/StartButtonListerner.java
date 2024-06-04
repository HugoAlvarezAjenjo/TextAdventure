package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import es.hugoalvarezajenjo.textadventure.ui.MainWindowController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButtonListerner implements ActionListener {
    final MainWindowController mainWindowController;

    public StartButtonListerner(final MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainWindowController.showChoiceScreen();
    }
}
