package org.example.day1.oper;

import javax.swing.*;

public class Oper3 {
    public static void main(String[] args) {
        // 정수 2개(a, b)를 입력으로 받음 (JOptionPane 활용할 것)
        String a = JOptionPane.showInputDialog("정수1 입력");
        String b = JOptionPane.showInputDialog("정수2 입력");

        // int로 변환하여 a2, b2로 저장
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        // 두 입력값의 평균을 구하시오. (실수로)
        double avg = (double)(a2 + b2) / 2;
        System.out.println(avg);

        // 결과값을 JOptionPane으로 표현 (null: 출력 위치가 중앙)
        JOptionPane.showMessageDialog(null, avg);
    }
}
