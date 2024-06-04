package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

import javax.swing.*;
import java.awt.*;

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
