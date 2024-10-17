package org.example.day13.quiz.statics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    static int count = 0;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Button Click Counter");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("Button Clicked " + count + " times");
        label.setHorizontalAlignment(JLabel.CENTER);

        JButton button = new JButton();
        button.setText("Click Me!");
        button.setForeground(Color.RED);

        f.add(label, BorderLayout.CENTER);
        f.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Button Clicked " + count + " times");
            }
        });

        f.setVisible(true);
    }
}
