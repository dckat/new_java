package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        // 전체 프레임 필요 ==> new를 이용해서 만들어둠.
        JFrame f = new JFrame();
        System.out.println(f);
        f.setSize(300, 300);

        String[] title = {"장소", "누구와", "언제"};
        String[][] contents = {
                {"부산", "동생", "아침출발"},
                {"대구", "친구", "점심출발"},
                {"서울", "동료", "저녁출발"}
        };

        JTable table = new JTable(contents, title);
        JScrollPane pane = new JScrollPane(table);
        f.add(pane);

        // setVisible은 맨 마지막에
        f.setVisible(true);
    }
}
