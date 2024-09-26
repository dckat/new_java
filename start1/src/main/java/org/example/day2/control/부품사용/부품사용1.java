package org.example.day2.control.부품사용;

import javax.swing.*;
import java.awt.*;

public class 부품사용1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        f.setSize(300, 300);

        b1.setText("나를 클릭하세요.");
        b2.setText("나도 클릭하세요.");
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLUE);
        b1.setForeground(Color.YELLOW);
        b2.setForeground(Color.ORANGE);

        // 글꼴, 진하게, 사이즈 등을 입력값으로 필요
        Font font = new Font("휴먼", Font.BOLD, 20);

        b1.setFont(font);
        b2.setFont(font);

        // 버튼의 배치
        // 물 흐르는 것처럼 순서대로 붙이는 레이아웃
        FlowLayout f1 = new FlowLayout();
        f.setLayout(f1);

        // flow 없이 default: 가운데에만 들어감 (덮어쓰는 경우 발생)
        f.add(b1);
        f.add(b2);

        // 세팅된 것을 보여주는 것은 항상 맨 마지막 줄에
        f.setVisible(true);     // 보여주도록 설정 (명시 안할 경우 표시 안됨)
    }
}
