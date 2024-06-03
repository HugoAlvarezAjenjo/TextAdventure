package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import javax.swing.*;
import java.awt.*;

public class ChoiceButtonPanel extends JPanel {
    public ChoiceButtonPanel() {
        this.setBounds(250,350, 300, 150);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(4,1));

        this.add(new ChoiceButton("Choice 1"));
        this.add(new ChoiceButton("Choice 2"));
        this.add(new ChoiceButton("Choice 3"));
        this.add(new ChoiceButton("Choice 4"));
    }
}
