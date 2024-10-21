package org.example.day15.referencecast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight {
    static JFrame f;
    public static void main(String[] args) {
        f = new JFrame("Traffic Light");
        f.setSize(600, 700);
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // FlowLayout 생성
        FlowLayout layout = new FlowLayout();

        Font font = new Font("arial", Font.BOLD, 35);

        // 버튼 3개 생성
        JButton red = new JButton("빨강신호");
        red.setOpaque(true);
        red.setBorderPainted(false);
        red.setBackground(Color.RED);
        red.setFont(font);
        JButton yellow = new JButton("노랑신호");
        yellow.setOpaque(true);
        yellow.setBorderPainted(false);
        yellow.setBackground(Color.YELLOW);
        yellow.setFont(font);
        JButton green = new JButton("초록신호");
        green.setOpaque(true);
        green.setBorderPainted(false);
        green.setBackground(Color.GREEN);
        green.setFont(font);

        // 프레임에 레이아웃 설정
        f.setLayout(layout);

        // 프레임에 버튼 3개 추가
        f.add(red);
        f.add(yellow);
        f.add(green);

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("r.png");
            }
        });

        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("y.png");
            }
        });

        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("g.png");
            }
        });

        f.setVisible(true);
    }

    public static void show(String image) {
        // 이미지 만들어서 라벨에 껴서 프레임에 add
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);
    }
}
