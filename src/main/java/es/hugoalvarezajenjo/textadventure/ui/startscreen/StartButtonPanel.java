package es.hugoalvarezajenjo.textadventure.ui.startscreen;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import es.hugoalvarezajenjo.textadventure.ui.theme.Fonts;

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
