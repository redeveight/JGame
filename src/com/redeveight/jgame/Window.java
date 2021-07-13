package com.redeveight.jgame;

import javax.swing.JFrame;

public class Window extends JFrame {

    public Window() {
        setTitle("JGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(1280, 720));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
