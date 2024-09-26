package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 인기투표 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(380, 900);

        Font font = new Font("arial", Font.BOLD, 20);
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();

        JLabel l1 = new JLabel();
        l1.setText("K-pop 인기 투표");
        l1.setFont(font);

        JLabel l2 = new JLabel();
        l2.setText("아이유");
        l2.setFont(font);

        JLabel l3 = new JLabel();
        l3.setText("프로미스");
        l3.setFont(font);

        JLabel l4 = new JLabel();
        l4.setText("스테이씨");
        l4.setFont(font);

        ImageIcon icon1 = new ImageIcon("001.png");
        b1.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("002.png");
        b2.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("003.png");
        b3.setIcon(icon3);

        frame.add(l1);
        frame.add(b1);  frame.add(l2);
        frame.add(b2);  frame.add(l3);
        frame.add(b3);  frame.add(l4);

        b1.addActionListener(new ActionListener() {
            int iu = 0;
            public void actionPerformed(ActionEvent e) {
                // b1이 클릭될 때마다 자동으로 실행되는 코드
                iu++;
                l2.setText("아이유>> "  + iu);
                System.out.println("버튼 1 클릭됨.");
            }
        });

        b2.addActionListener(new ActionListener() {
            int fro = 0;
            public void actionPerformed(ActionEvent e) {
                fro++;
                l3.setText("프로미스>> "  + fro);
                System.out.println("버튼 2 클릭됨.");
            }
        });

        b3.addActionListener(new ActionListener() {
            int st = 0;
            public void actionPerformed(ActionEvent e) {
                st++;
                l4.setText("스테이씨>> " + st);
                System.out.println("버튼 3 클릭됨.");
            }
        });

        frame.setVisible(true);
    }
}
