package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoPanel extends JPanel {
    public PlayerInfoPanel() {
        this.setBounds(100, 15, 600, 50);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(1, 4));

        this.add(new PlayerInfoLabel("HP"));
        this.add(new PlayerInfoLabel());
        this.add(new PlayerInfoLabel("Weapon"));
        this.add(new PlayerInfoLabel());
    }
}
