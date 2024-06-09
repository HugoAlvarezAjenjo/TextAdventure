package es.hugoalvarezajenjo.textadventure.ui.choicescreen;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PlayerInfoPanel extends JPanel {
    private final PlayerInfoLabel hpLabel;
    private final PlayerInfoLabel weaponNameLabel;

    public PlayerInfoPanel() {
        this.setBounds(100, 15, 600, 50);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(1, 4));

        this.hpLabel = new PlayerInfoLabel();
        this.weaponNameLabel = new PlayerInfoLabel();

        this.add(new PlayerInfoLabel("HP"));
        this.add(this.hpLabel);
        this.add(new PlayerInfoLabel("Weapon"));
        this.add(this.weaponNameLabel);
    }

    public void setHp(final int hp) {
        this.hpLabel.setText(hp + "");
    }

    public void setWeaponName(final String weaponName) {
        this.weaponNameLabel.setText(weaponName);
    }
}
