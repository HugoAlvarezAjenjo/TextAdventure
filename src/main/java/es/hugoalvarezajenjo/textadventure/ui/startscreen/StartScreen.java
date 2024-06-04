package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import javax.swing.*;
import java.awt.*;

public class StartScreen extends JPanel {
    public StartScreen() {
        this.setSize(800,600);
        this.setBackground(Color.BLACK);
        this.setLayout(null);

        this.add(new TitleNamePanel());
        this.add(new StartButtonPanel());
    }
}
