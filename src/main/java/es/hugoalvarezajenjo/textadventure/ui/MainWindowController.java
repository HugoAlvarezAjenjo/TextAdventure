package es.hugoalvarezajenjo.textadventure.ui;

import es.hugoalvarezajenjo.textadventure.logic.PlayerManager;
import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceScreen;
import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceScreenController;
import es.hugoalvarezajenjo.textadventure.ui.startscreen.StartButtonListerner;
import es.hugoalvarezajenjo.textadventure.ui.startscreen.StartScreen;

public class MainWindowController {
    private final MainWindow mainWindow;
    
    public MainWindowController(final MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public void showStartScreen() {
        this.mainWindow.getContentPane().removeAll();
        this.mainWindow.getContentPane().add(new StartScreen(new StartButtonListerner(this)));
        this.mainWindow.revalidate();
        this.mainWindow.repaint();
        this.mainWindow.setVisible(true);
    }

    public void showChoiceScreen() {
        final ChoiceScreen screen = new ChoiceScreen();
        final ChoiceScreenController controller = new ChoiceScreenController(screen, new PlayerManager());
        this.mainWindow.getContentPane().removeAll();
        this.mainWindow.getContentPane().add(screen);
        this.mainWindow.revalidate();
        this.mainWindow.repaint();
    }
}