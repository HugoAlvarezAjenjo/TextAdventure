package es.hugoalvarezajenjo.textadventure.ui;

import es.hugoalvarezajenjo.textadventure.ui.choicescreen.ChoiceScreen;
import es.hugoalvarezajenjo.textadventure.ui.startscreen.StartScreen;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setResizable(false);
    }
}
