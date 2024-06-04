package es.hugoalvarezajenjo.textadventure.ui;

import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceScreen;
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
        this.mainWindow.getContentPane().removeAll();
        this.mainWindow.getContentPane().add(new ChoiceScreen());
        this.mainWindow.revalidate();
        this.mainWindow.repaint();
    }
}
