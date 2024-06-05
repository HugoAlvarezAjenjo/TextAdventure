package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceButtonListener implements ActionListener {
    private ChoiceScreenController controller;

    public void setController(final ChoiceScreenController controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println(e.getActionCommand());
        this.controller.notifyChoice(e.getActionCommand());
    }
}
