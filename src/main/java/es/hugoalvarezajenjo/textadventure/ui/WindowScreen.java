package es.hugoalvarezajenjo.textadventure.ui;

import es.hugoalvarezajenjo.textadventure.ui.theme.Dimensions;

import javax.swing.*;
import java.awt.*;

public abstract class WindowScreen extends JPanel {
    public WindowScreen() {
        this.setSize(Dimensions.DEFAULT_WINDOW_SIZE);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
    }
}
