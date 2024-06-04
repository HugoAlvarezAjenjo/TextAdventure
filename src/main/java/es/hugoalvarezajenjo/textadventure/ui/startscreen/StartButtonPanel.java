package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartButtonPanel extends JPanel {
    public StartButtonPanel(final ActionListener onStartButtonClick) {
        this.setBounds(300, 400, 200, 100);
        this.setBackground(Color.BLACK);
        this.add(newStartButton(onStartButtonClick));
    }

    private JButton newStartButton(final ActionListener onClick) {
        final JButton startButton = new JButton("Start");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(Fonts.NORMAL_FONT);
        startButton.setFocusPainted(false);
        startButton.addActionListener(onClick);
        return startButton;
    }
}
