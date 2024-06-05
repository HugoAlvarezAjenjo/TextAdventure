package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ChoiceButtonPanel extends JPanel {
    private final ChoiceButton choice1;
    private final ChoiceButton choice2;
    private final ChoiceButton choice3;
    private final ChoiceButton choice4;

    public ChoiceButtonPanel(final ActionListener actionListener) {
        this.setBounds(250,350, 300, 150);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(4,1));

        this.choice1 = new ChoiceButton("Choice1");
        this.choice1.addActionListener(actionListener);
        this.choice2 = new ChoiceButton("Choice2");
        this.choice2.addActionListener(actionListener);
        this.choice3 = new ChoiceButton("Choice3");
        this.choice3.addActionListener(actionListener);
        this.choice4 = new ChoiceButton("Choice4");
        this.choice4.addActionListener(actionListener);

        this.add(choice1);
        this.add(choice2);
        this.add(choice3);
        this.add(choice4);
    }
}
