package es.hugoalvarezajenjo.textadventure.ui;

import java.awt.Color;

import javax.swing.JFrame;

import es.hugoalvarezajenjo.textadventure.ui.theme.Dimensions;

public class MainWindow extends JFrame {
    public MainWindow() {
        this.setSize(Dimensions.DEFAULT_WINDOW_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setResizable(false);
    }
}
