package org.example.day2.control.순차문;

import javax.swing.*;

public class 순차문1 {
    public static void main(String[] args) {
        String id = "root";
        String pw = "1234";

        // 입력하는 처리 필요
        String id2 = null;  // 기본형이 아닌것은 null로 초기화
        String pw2 = null;
        id2 = JOptionPane.showInputDialog("id 입력");     // "admin", "root"
        pw2 = JOptionPane.showInputDialog("pw 입력");     // "1111", "1234"

        System.out.println(id.equals(id2) && pw.equals(pw2));
    }
}
