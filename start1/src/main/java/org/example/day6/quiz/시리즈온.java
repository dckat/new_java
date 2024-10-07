package org.example.day6.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 시리즈온 {
    static int current = 2;
    public static void main(String[] args) {
        String[] titles = {"인사이드 아웃2", "데드풀과 울버린", "콰이어트 플레이스:첫째 날", "너의 이름은", "초속5센티미터"};
        String[] image = {"insideout.png", "deadpool.png", "quietplace.png", "yourname.png", "5centimeter.png"};
        int[] price = {10900, 10900, 5500, 1200, 1540};

        JFrame frame = new JFrame();
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JLabel listTitle = new JLabel();
        listTitle.setText("네이버 시리즈온 실시간 영화 목록\n");
        frame.add(listTitle, BorderLayout.NORTH);

        JLabel img = new JLabel();
        ImageIcon icon = new ImageIcon(image[current]);
        img.setIcon(icon);
        frame.add(img, BorderLayout.CENTER);

        /*
        JButton search = new JButton();
        search.setText("조회하기");
        frame.add(search, BorderLayout.AFTER_LAST_LINE);
        */
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText((current+1) + "." + titles[current] + " - 가격: " + price[current] + "원");
        JButton info = new JButton();
        info.setText("정보확인");
        info.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5)");
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 5) {
                    label.setText((num) + "." + titles[num-1] + " - 가격: " + price[num-1] + "원");
                    ImageIcon icon = new ImageIcon(image[num-1]);
                    img.setIcon(icon);
                    current = num - 1;
                    JOptionPane.showMessageDialog(frame, "선택한 영화: " + titles[num-1] + "\n"
                            + "가격: " + price[num-1] + "원");
                }
                else {
                    JOptionPane.showMessageDialog(frame, "잘못된 입력값!!");
                }
            }
        });

        panel.add(label);
        panel.add(info);
        frame.add(panel, BorderLayout.SOUTH);

        Font font = new Font("AppleGothic", Font.BOLD, 20);
        listTitle.setFont(font);

        JButton left = new JButton();
        left.setText("<<");
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (current > 0) {
                    current--;
                    label.setText((current+1) + "." + titles[current] + " - 가격: " + price[current] + "원");
                    ImageIcon icon = new ImageIcon(image[current]);
                    img.setIcon(icon);
                }
                else {
                    JOptionPane.showMessageDialog(null, "왼쪽 끝입니다.");
                }
            }
        });
        frame.add(left, BorderLayout.WEST);

        JButton right = new JButton();
        right.setText(">>");
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (current < 4) {
                    current++;
                    label.setText((current + 1) + "." + titles[current] + " - 가격: " + price[current] + "원");
                    ImageIcon icon = new ImageIcon(image[current]);
                    img.setIcon(icon);
                }
                else {
                    JOptionPane.showMessageDialog(null,"오른쪽 끝입니다.");
                }
            }
        });
        frame.add(right, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
