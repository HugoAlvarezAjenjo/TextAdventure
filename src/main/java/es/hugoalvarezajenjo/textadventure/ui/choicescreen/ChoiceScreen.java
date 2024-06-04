package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import javax.swing.*;
import java.awt.*;

public class ChoiceScreen extends JPanel {
    public ChoiceScreen() {
        this.setSize(800,600);
        this.setBackground(Color.BLACK);
        this.setLayout(null);

        this.add(new ChoiceButtonPanel());
        this.add(new MainTextPanel());
        this.add(new PlayerInfoPanel());
    }
}
