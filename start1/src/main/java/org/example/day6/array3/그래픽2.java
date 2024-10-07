package org.example.day6.array3;

import javax.swing.*;

public class 그래픽2 {
    public static void main(String[] args) {
        // 하나씩 하고 확인하는 연습
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setTitle("그래픽2 연습");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setText("나를 눌러!!!");

        f.add(button);

        /* 버튼 클릭시 이벤트함수
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼 클릭됨!!!");
            }
        });
        */

        f.setVisible(true);
    }
}
