package org.example.day16.inter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CharacterReader {
    public static void main(String[] args) {
        Random r = new Random();
        JFrame f = new JFrame("글자/단어 길이 판독기");
        f.setSize(300, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel l1 = new JLabel("문장을 넣으세요.");
        JTextArea area = new JTextArea(7, 10);
        area.setAutoscrolls(true);
        area.setLineWrap(true);

        JButton b1 = new JButton("글자수 카운트");
        JButton b2 = new JButton("배경색 바꾸기");
        JButton b3 = new JButton("글자색 바꾸기");

        l1.setFont(font);
        area.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);

        f.add(l1);
        f.add(area);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
                area.setText("");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int lRed = r.nextInt(256);
                int lGreen = r.nextInt(256);
                int lBlue = r.nextInt(256);
                int tRed = r.nextInt(256);
                int tGreen = r.nextInt(256);
                int tBlue = r.nextInt(256);
                l1.setForeground(new Color(lRed, lGreen, lBlue));
                area.setBackground(new Color(tRed, tGreen, tBlue));
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int red = r.nextInt(256);
                int green = r.nextInt(256);
                int blue = r.nextInt(256);
                area.setForeground(new Color(red, green, blue));
            }
        });

        f.setVisible(true);
    }
}
