package org.example.day13.quiz.statics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Q1 {
    static Random random = new Random();
    public static void main(String[] args) {
        Random r = new Random();
        JFrame f = new JFrame();
        f.setTitle("Button Click Counter");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setText("Press the button to change my color");
        label.setBackground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);

        JButton button = new JButton();
        button.setText("Change Color");
        button.setForeground(Color.RED);

        f.add(label, BorderLayout.CENTER);
        f.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }
        });

        f.setVisible(true);
    }
}
