package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

import javax.swing.*;
import java.awt.*;

public class ChoiceButton extends JButton {
    public ChoiceButton(final String text) {
        super(text);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(Fonts.NORMAL_FONT);
        this.setFocusPainted(false);
    }
}
