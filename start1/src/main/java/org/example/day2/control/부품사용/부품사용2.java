package org.example.day2.control.부품사용;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setTitle("부품사용연습");   // JFrame 이름 설정

        // 버튼 하나 생성
        JButton b = new JButton();

        // 버튼 설정은 사용자 임의
        b.setText("Hello World");
        b.setBackground(Color.BLUE);
        b.setForeground(Color.RED);

        f.add(b);

        f.setVisible(true);
    }
}
