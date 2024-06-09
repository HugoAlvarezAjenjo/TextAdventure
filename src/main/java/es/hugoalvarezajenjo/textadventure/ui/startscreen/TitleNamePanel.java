package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

public class TitleNamePanel extends JPanel {

    public TitleNamePanel() {
        this.setBounds(100,100,600,500);
        this.setBackground(Color.BLACK);

        final JLabel label = new JLabel("Adventure");
        label.setForeground(Color.WHITE);
        label.setFont(Fonts.TITLE_FONT);

        this.add(label);
    }
}
