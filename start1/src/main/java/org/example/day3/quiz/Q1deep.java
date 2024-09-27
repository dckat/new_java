package org.example.day3.quiz;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1deep {
    static int iu = 0;
    static int fro = 0;
    static int st = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(180, 200);

        Font font = new Font("arial", Font.BOLD, 15);
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JLabel l1 = new JLabel();
        l1.setText("Select your favorite song:");
        l1.setFont(font);

        JButton b1 = new JButton();
        b1.setText("아이유 - LILAC");
        JButton b2 = new JButton();
        b2.setText("프로미스나인 - We Go");
        JButton b3 = new JButton();
        b3.setText("스테이씨 - ASAP");
        JButton b4 = new JButton();
        b4.setText("종료");

        frame.add(l1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You voted for 아이유 - LILAC");
                iu++;
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You voted for 프로미스나인 - We Go");
                fro++;
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You voted for 스테이씨 - ASAP");
                st++;
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "투표 결과: \n" + "아이유 - LILAC: " + iu + "표\n"
                        + "프로미스나인 - We Go: " + fro + "표\n"
                        + "스테이씨 - ASAP: " + st + "표\n";
                JOptionPane.showMessageDialog(null, message);
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}

