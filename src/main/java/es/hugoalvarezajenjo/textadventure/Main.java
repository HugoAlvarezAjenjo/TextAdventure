package es.hugoalvarezajenjo.textadventure;

import es.hugoalvarezajenjo.textadventure.ui.MainWindow;
import es.hugoalvarezajenjo.textadventure.ui.MainWindowController;

public class Main {
    public static void main(String[] args) {
        final MainWindow window = new MainWindow();
        final MainWindowController controller = new MainWindowController(window);
        controller.showStartScreen();
    }
}