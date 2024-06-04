package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

import javax.swing.*;
import java.awt.*;

public class MainTextPanel extends JPanel {
    private final JTextArea textArea;

    public MainTextPanel() {
        this.setBounds(100, 100, 600,250);
        this.setBackground(Color.BLACK);

        this.textArea = this.newTextArea();
        this.add(this.textArea);
    }

    private JTextArea newTextArea() {
        final JTextArea textArea = new JTextArea("This is the main text area");
        textArea.setBounds(100, 100, 600,250);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setEditable(false);
        textArea.setFont(Fonts.NORMAL_FONT);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        return textArea;
    }
}
