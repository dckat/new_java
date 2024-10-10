package org.example.day8.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public void open() {
        JFrame frame = new JFrame();
        frame.setTitle("일기 쓰기 창");
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel today = new JLabel();
        today.setText("오늘의 날짜");
        today.setFont(font);
        JLabel title = new JLabel();
        title.setText("오늘의 제목");
        title.setFont(font);
        JLabel content = new JLabel();
        content.setText("오늘의 내용");
        content.setFont(font);

        JTextField today2 = new JTextField(10);
        today2.setForeground(Color.BLUE);
        today2.setFont(font);
        JTextField title2 = new JTextField(10);
        title2.setForeground(Color.BLUE);
        title2.setFont(font);
        JTextField content2 = new JTextField(10);
        content2.setForeground(Color.BLUE);
        content2.setFont(font);

        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        save.setBackground(Color.MAGENTA);
        save.setOpaque(true);
        save.setBorderPainted(false);
        save.setFont(font);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String today3 = today2.getText();
                String title3 = title2.getText();
                String content3 = content2.getText();
                System.out.println("오늘의 날짜: " + today3);
                System.out.println("오늘의 제목: " + title3);
                System.out.println("오늘의 내용: " + content3);

                // 파일을 만드는 부품
                // 가지고 온 데이터를 파일에 저장

                // FileWriter: 파일을 생성하고, 스트림으로 데이터를 저장까지 해주는 부품
                try {
                    FileWriter file = new FileWriter(today3 + ".txt");
                    file.write(today3 + "\n");
                    file.write(title3 + "\n");
                    file.write(content3 + "\n");
                    file.close();
                    JOptionPane.showMessageDialog(frame, "파일에 잘 저장되었습니다.");
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }
            }
        });

        frame.add(today);
        frame.add(today2);
        frame.add(title);
        frame.add(title2);
        frame.add(content);
        frame.add(content2);
        frame.add(save);

        frame.setVisible(true);
    }
}
