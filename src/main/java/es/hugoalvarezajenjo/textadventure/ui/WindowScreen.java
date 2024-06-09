package es.hugoalvarezajenjo.textadventure.ui;

import java.awt.Color;

import javax.swing.JPanel;

import es.hugoalvarezajenjo.textadventure.ui.theme.Dimensions;

public abstract class WindowScreen extends JPanel {
    public WindowScreen() {
        this.setSize(Dimensions.DEFAULT_WINDOW_SIZE);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
    }
}
