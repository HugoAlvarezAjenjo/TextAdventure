package es.hugoalvarezajenjo.textadventure;

import es.hugoalvarezajenjo.textadventure.logic.PlayerManager;
import es.hugoalvarezajenjo.textadventure.logic.StoryManager;
import es.hugoalvarezajenjo.textadventure.ui.MainWindow;
import es.hugoalvarezajenjo.textadventure.ui.MainWindowController;

public class Main {
    public static void main(String[] args) {
        final PlayerManager playerManager = new PlayerManager();
        final StoryManager storyManager = new StoryManager();
        final MainWindow window = new MainWindow();
        final MainWindowController controller = new MainWindowController(window, playerManager, storyManager);
        controller.showStartScreen();
    }
}