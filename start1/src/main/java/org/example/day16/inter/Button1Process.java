package org.example.day16.inter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener는 버튼을 클릭했을 때 처리 표준으로 만들어놓음.
public class Button1Process implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("버튼1 클릭함.");
    }
}
