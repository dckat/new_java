package org.example.day3.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3deep {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 600);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JLabel l1 = new JLabel();
        l1.setText("먹고 싶은 음식");

        JLabel l2 = new JLabel();
        l2.setText("당신의 나이는");

        JLabel l3 = new JLabel();
        l3.setText("국어 점수");

        JLabel l4 = new JLabel();
        l4.setText("수학 점수");

        JButton b1 = new JButton();
        b1.setText("어디로 갈까?");
        JButton b2 = new JButton();
        b2.setText("나의 내년 나이는?");
        JButton b3 = new JButton();
        b3.setText("두 과목 점수의 평균은?");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(10);

        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(t4);
        frame.add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String menu = t1.getText();
                if (menu.equals("Americano")) {
                    JOptionPane.showMessageDialog(null, "카페로 가세요.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "그럼 물을 마셔요.");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String age = t2.getText();
                int nextAge = Integer.parseInt(age) + 1;

                JOptionPane.showMessageDialog(null, "당신은 내년에 " + nextAge + "살이 됩니다.");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String koreanScore = t3.getText();
                String englishScore = t4.getText();

                double avg = (Integer.parseInt(koreanScore) + Integer.parseInt(englishScore)) / 2.0;

                JOptionPane.showMessageDialog(null, "평균 점수는 " + avg + "입니다.");
            }
        });

        frame.setVisible(true);
    }
}
