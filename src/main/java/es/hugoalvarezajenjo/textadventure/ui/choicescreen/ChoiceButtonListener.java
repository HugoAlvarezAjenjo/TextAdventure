package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceButtonListener implements ActionListener {
    private ChoiceScreenController controller;

    public ChoiceButtonListener() {
    }

    public void setController(final ChoiceScreenController controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()) {
            case "Choice1" -> this.controller.selectOption1();
            case "Choice2" -> this.controller.selectOption2();
            case "Choice3" -> this.controller.selectOption3();
            case "Choice4" -> this.controller.selectOption4();
        }
    }
}
