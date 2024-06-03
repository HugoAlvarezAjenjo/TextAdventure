package es.hugoalvarezajenjo.textadventure.ui;

import es.hugoalvarezajenjo.textadventure.ui.startscreen.StartButtonPanel;
import es.hugoalvarezajenjo.textadventure.ui.startscreen.TitleNamePanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);

        this.add(new TitleNamePanel());
        this.add(new StartButtonPanel());

        this.setVisible(true);
    }
}
