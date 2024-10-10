package org.example.day8.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 로그인화면 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(380, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 150);
        Font font2 = new Font("Arial", Font.BOLD, 25);

        // JLabel 3개, JTextField 2개, JButton 2개
        JLabel top = new JLabel();
        top.setText("일기장");
        top.setFont(font);
        JLabel id = new JLabel();
        id.setText("ID");
        id.setFont(font2);
        JLabel pw = new JLabel();
        pw.setText("PW");
        pw.setFont(font2);

        JTextField id2 = new JTextField(10);
        id2.setBackground(Color.YELLOW);
        id2.setForeground(Color.BLUE);
        JTextField pw2 = new JTextField(10);
        pw2.setBackground(Color.YELLOW);
        pw2.setForeground(Color.BLUE);

        JButton ok = new JButton();
        ok.setText("OK~!");
        ok.setFont(font2);
        ok.setBackground(Color.GREEN);
        ok.setOpaque(true);
        ok.setBorderPainted(false);
        JButton delete = new JButton();
        delete.setText("Del");
        delete.setFont(font2);
        delete.setBackground(Color.GREEN);
        delete.setOpaque(true);
        delete.setBorderPainted(false);

        ImageIcon icon = new ImageIcon("ok.png");
        ok.setIcon(icon);
        ImageIcon icon2 = new ImageIcon("del.png");
        delete.setIcon(icon2);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(ok);
        frame.add(delete);

        // ok버튼 - 아이디와 패스워드가 각각 root 1234가 맞는지 확인
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ok버튼을 클릭했을 때 처리하는 내용
                String id3 = id2.getText();  // id2에 입력한 값을 가지고 옴
                String pw3 = pw2.getText();
                System.out.println(id3.length() + " " + pw3.length());

                if (id3.equals("root") && pw3.equals("1234")) {
                    // JOptionPane.showMessageDialog(frame, "로그인 성공!");
                    frame.setTitle("로그인 성공!");
                    // 일기쓰기화면이 보이도록 설정
                    일기쓰기화면 diary = new 일기쓰기화면();
                    diary.open();
                }
                else if (id3.length() == 0 || pw3.length() == 0) {
                    // JOptionPane.showMessageDialog(frame, "아이디 또는 비밀번호를 입력해주세요!");
                    frame.setTitle("아이디 또는 비밀번호 입력해주세요");
                }
                else {
                    // JOptionPane.showMessageDialog(frame, "로그인 실패!");
                    frame.setTitle("로그인 실패!");
                }
            }
        });

        // del버튼 - 입력한 값 지우기
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id2.setText("");
                pw2.setText("");
            }
        });
        frame.setVisible(true);
    }
}
