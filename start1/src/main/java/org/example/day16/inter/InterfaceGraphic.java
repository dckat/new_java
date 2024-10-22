package org.example.day16.inter;

import javax.swing.*;
import java.awt.*;

public class InterfaceGraphic {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("나를 눌러요.");
        JButton b2 = new JButton("나도 눌러요.");
        f.add(b1);
        f.add(b2);
        Font font = new Font("궁서", Font.BOLD, 50);
        b1.setFont(font);
        b2.setFont(font);

        TextArea list = new TextArea(6, 13);
        list.setFont(font);
        f.add(list);

        b1.addActionListener(new Button1Process());
        b2.addActionListener(new Button2Process());

        f.setVisible(true);
    }
}
