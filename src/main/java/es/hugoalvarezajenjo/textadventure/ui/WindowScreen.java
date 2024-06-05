package es.hugoalvarezajenjo.textadventure.ui;

import javax.swing.*;
import java.awt.*;

public abstract class WindowScreen extends JPanel {
    public WindowScreen() {
        this.setSize(800, 600);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
    }
}
