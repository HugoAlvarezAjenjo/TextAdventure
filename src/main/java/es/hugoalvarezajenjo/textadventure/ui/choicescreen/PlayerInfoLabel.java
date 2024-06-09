package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import java.awt.Color;

import javax.swing.JLabel;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

public class PlayerInfoLabel extends JLabel {
    public PlayerInfoLabel() {
        this("");
    }

    public PlayerInfoLabel(final String text) {
        super(text);
        this.setFont(Fonts.NORMAL_FONT);
        this.setForeground(Color.WHITE);
    }
}
