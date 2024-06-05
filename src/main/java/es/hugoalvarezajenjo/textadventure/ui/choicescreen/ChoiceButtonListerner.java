package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceButtonListerner implements ActionListener {
    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
