package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    static int count = 0;       // 예매한 좌석수 누적용
    static String seat = "";    // 예매한 좌석번호 누적용
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);    // add한 순서대로 물 흐르듯이 뒤에 붙여줌

        for (int i = 1; i <= 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // 버튼 클릭했을 때 실행되는 내용
                    // 버튼 클릭 시에 ActionListener에 있는 actionPerformed 메소드 자동 실행
                    String s = e.getActionCommand();    // 버튼 위에 있는 텍스트를 가지고 옴
                    JOptionPane.showMessageDialog(frame, s + "번 좌석 예매되었습니다.");
                    button.setEnabled(false);   // 버튼이 더이상 클릭되지 못하도록 설정
                    button.setBackground(Color.red);
                    button.setOpaque(true);
                    button.setBorderPainted(false);
                    System.out.println(s);
                    seat += s + " ";
                    count++;
                }
            });
            frame.add(button);
        }

        // 결제하기 버튼
        JButton pay = new JButton();
        pay.setText("결제하기");
        pay.setBackground(Color.yellow);
        pay.setOpaque(true);
        pay.setBorderPainted(false);
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = count*10000;
                JOptionPane.showMessageDialog(frame, "예매한 좌석번호는 " + seat);
                JOptionPane.showMessageDialog(frame, "최종 결제금액은 " + total + "원 입니다.");
                /* 결제금액과 예매좌석을 reset (필요시에 추가 구현)
                count = 0;
                seat = "";
                */
            }
        });
        frame.add(pay);

        // 보여지는건 항상 맨 마지막에
        frame.setVisible(true);
    }
}
