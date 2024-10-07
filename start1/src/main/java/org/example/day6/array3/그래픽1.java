package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setTitle("그래픽 연습");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // 닫기를 누르면 프로그램이 종료되도록 설정

        JButton button1 = new JButton();
        button1.setText("나를 눌러!");     // 함수.메소드.명령어는 명령어(입력 데이터); 형식을 지킴

        JButton button2 = new JButton();
        button2.setText("@@@@@@@@");     // 함수.메소드.명령어는 명령어(입력 데이터); 형식을 지킴

        // JFrame은 윗쪽, 왼쪽, 가운데, 오른쪽, 아랫쪽 중
        // 기본 설정 되어있는 위치: 가운데
        f.add(button1, BorderLayout.NORTH);
        f.add(button2, BorderLayout.CENTER);

        // 맨 끝
        f.setVisible(true);
    }
}
