package es.hugoalvarezajenjo.textadventure.ui;

import es.hugoalvarezajenjo.textadventure.logic.PlayerManager;
import es.hugoalvarezajenjo.textadventure.logic.StoryManager;
import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceButtonListener;
import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceScreen;
import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceScreenController;
import es.hugoalvarezajenjo.textadventure.ui.endscreen.EndScreen;
import es.hugoalvarezajenjo.textadventure.ui.startscreen.StartButtonListerner;
import es.hugoalvarezajenjo.textadventure.ui.startscreen.StartScreen;

public class MainWindowController {
    private final MainWindow mainWindow;
    private final StoryManager storyManager;
    private final PlayerManager playerManager;

    public MainWindowController(final MainWindow mainWindow, final PlayerManager playerManager, final StoryManager storyManager) {
        this.mainWindow = mainWindow;
        this.playerManager = playerManager;
        this.storyManager = storyManager;
    }

    public void showStartScreen() {
        this.mainWindow.getContentPane().removeAll();
        this.mainWindow.getContentPane().add(new StartScreen(new StartButtonListerner(this)));
        this.mainWindow.revalidate();
        this.mainWindow.repaint();
        this.mainWindow.setVisible(true);
    }

    public void showChoiceScreen() {
        final ChoiceButtonListener listener = new ChoiceButtonListener();
        final ChoiceScreen screen = new ChoiceScreen(listener);
        final ChoiceScreenController controller = new ChoiceScreenController(screen, this.playerManager, this.storyManager, this);
        listener.setController(controller);
        this.mainWindow.getContentPane().removeAll();
        this.mainWindow.getContentPane().add(screen);
        this.mainWindow.revalidate();
        this.mainWindow.repaint();
    }

    public void showEndScreen() {
        this.mainWindow.getContentPane().removeAll();
        this.mainWindow.getContentPane().add(new EndScreen());
        this.mainWindow.revalidate();
        this.mainWindow.repaint();
    }
}
