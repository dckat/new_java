package org.example.day2.control.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2deep {
    static int total = 0;
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 200);

        Font font = new Font("arial", Font.BOLD, 20);
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JLabel l1 = new JLabel();
        l1.setText("게임을 계속 하시겠습니까?");
        l1.setFont(font);

        JButton b1 = new JButton();
        b1.setText("계속");
        b1.setSize(400, 60);
        JButton b2 = new JButton();
        b2.setSize(400, 60);
        b2.setText("종료");

        frame.add(l1);
        frame.add(b1);
        frame.add(b2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num1 = JOptionPane.showInputDialog("첫 번째 사람이 숫자를 입력하세요");
                String num2 = JOptionPane.showInputDialog("두 번째 사람이 숫자를 입력하세요");

                int num3 = Integer.parseInt(num1);
                int num4 = Integer.parseInt(num2);

                if (num3 > num4) {
                    JOptionPane.showMessageDialog(null, "첫 번째 사람이 이겼습니다.");
                    a++;
                } else if (num3 < num4) {
                    JOptionPane.showMessageDialog(null, "두 번째 사람이 이겼습니다.");
                    b++;
                }
                total++;
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog( null,"총 게임 수: " + total + "\n"
                        + "첫 번째 사람이 이긴 수: " + a + "\n"
                + "두 번째 사람이 이긴 수: " + b + "\n");
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
