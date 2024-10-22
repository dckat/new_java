package org.example.day16.inter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGraphic2 implements ActionListener {
    static TextArea list;
    static JButton b1, b2;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        b1 = new JButton("나를 눌러요.");
        b2 = new JButton("나도 눌러요.");
        f.add(b1);
        f.add(b2);
        Font font = new Font("궁서", Font.BOLD, 50);
        b1.setFont(font);
        b2.setFont(font);

        list = new TextArea(6, 13);
        list.setFont(font);
        f.add(list);

        InterfaceGraphic2 action = new InterfaceGraphic2();
        b1.addActionListener(action);
        b2.addActionListener(action);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            list.append("b1 클릭함.\n");
        }
        if (e.getSource() == b2) {
            list.append("b2 클릭함.\n");
        }
    }
}
