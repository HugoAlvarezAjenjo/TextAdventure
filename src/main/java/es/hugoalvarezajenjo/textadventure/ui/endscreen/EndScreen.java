package es.hugoalvarezajenjo.textadventure.ui.endscreen;

import es.hugoalvarezajenjo.textadventure.ui.WindowScreen;
import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

import javax.swing.*;
import java.awt.*;

public class EndScreen extends WindowScreen {
    public EndScreen() {
        this.setLayout(new BorderLayout());
        this.add(this.youDied(), BorderLayout.CENTER);


    }

    private JLabel youDied() {
        final JLabel label = new JLabel("You Died", JLabel.CENTER);
        label.setFont(Fonts.TITLE_FONT);
        label.setForeground(Color.RED);
        return label;
    }
}
