package pooyan.levels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import pooyan.Constants;

public class MainMenu extends LevelBase implements ActionListener {
    JLabel lblLogo, lblMenu;
    JButton btnStart;
    JButton btnExit;

    String iconPath = Constants.ICON_PATH_MENU;

    public MainMenu() {
        super("Pooyan - Welcome");

        lblLogo = new JLabel(getImageIcon(iconPath + "logo.png"));
        lblMenu = new JLabel(getImageIcon(iconPath + "menu_label.png"));
        btnStart = new JButton("Start", null);
        btnExit = new JButton("Exit", null);

        btnStart.setFont(new Font("Aerial", Font.PLAIN, 22));
        btnExit.setFont(new Font("Aerial", Font.PLAIN, 22));

        lblLogo.setBounds(158, 70, 383, 117);
        lblMenu.setBounds(239, 200, 221, 87);
        btnStart.setBounds(275, 330, 150, 40);
        btnExit.setBounds(275, 385, 150, 40);

        Container cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.WHITE);

        cp.add(lblLogo);
        cp.add(lblMenu);
        cp.add(btnStart);
        cp.add(btnExit);

        setVisible(true);
        setResizable(false);
        setSize(700, 650);

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((d.width - 700) / 2, (d.height - 650) / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnStart.addActionListener(this);
        btnExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnStart) {
            new Level1();
            dispose();
        } else if (ae.getSource() == btnExit) {
            dispose();
        }
    }
}
