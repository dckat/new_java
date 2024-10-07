package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 교육평점순위 {
    // 변수가 선언된 위치를 포함한 곳 안에서 사용 가능
    static int current = 2;    // 현재 위치
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("교육평점순위-프로그래머스");
        frame.setSize(850, 530);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] title = {"프론트엔드", "백엔드", "데이터 엔지니어링", "데이터 분석", "웹 풀스택"};
        String[] img = {"front_end.png", "back_end.jpg", "data_engineering.png", "data_analysis.png", "full_stack.png"};
        double[] score = {9.9, 8.8, 7.7, 6.6, 5.5};

        // 텍스트 들어갈 자리 (위. 아래. 포스터 이미지)
        JLabel top = new JLabel();
        top.setText(title[current]);
        JLabel bottom = new JLabel();
        bottom.setText(score[current] + "");
        // String.valueOf(score[2]);
        JLabel center = new JLabel();
        ImageIcon icon = new ImageIcon(img[current]);
        center.setIcon(icon);

        // 버튼이 들어갈 자리 (왼쪽. 오른쪽 버튼)
        JButton left = new JButton();
        left.setText("<<");
        left.addActionListener(new ActionListener() {
            // addActionListener ==> 버튼이 클릭되었을 때 처리하는 기능을 구현
            public void actionPerformed(ActionEvent e) {
                // actionPerformed ==> 클릭했을때 실행되는 로직을 구현
                System.out.println("왼쪽 버튼 클릭됨!!");
                if (current > 0) {
                    current--;
                    top.setText(title[current]);
                    bottom.setText(score[current] + "");
                    ImageIcon icon = new ImageIcon(img[current]);
                    center.setIcon(icon);
                }
                else {
                    JOptionPane.showMessageDialog(null, "왼쪽 끝입니다.");
                }
            }
        });
        JButton right = new JButton();
        right.setText(">>");
        right.addActionListener(new ActionListener() {
            // addActionListener ==> 버튼이 클릭되었을 때 처리하는 기능을 구현
            public void actionPerformed(ActionEvent e) {
                // actionPerformed ==> 클릭했을때 실행되는 로직을 구현
                System.out.println("오른쪽 버튼 클릭됨!!");
                if (current < 4) {
                    current++;
                    top.setText(title[current]);
                    bottom.setText(score[current] + "");
                    ImageIcon icon = new ImageIcon(img[current]);
                    center.setIcon(icon);
                }
                else {
                    JOptionPane.showMessageDialog(null,"오른쪽 끝입니다.");
                }
            }
        });

        Font font = new Font("Arial", Font.BOLD, 25);
        top.setFont(new Font("AppleGothic", Font.BOLD, 35));
        bottom.setFont(font);
        left.setFont(font);
        right.setFont(font);

        frame.add(top, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
