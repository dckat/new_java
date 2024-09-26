package org.example.day2.control.순차문;

import javax.swing.*;

public class 순차문2 {
    public static void main(String[] args) {
        String answer = "맑음";

        // 날씨가 어때? 입력
        String answer1 = JOptionPane.showInputDialog("날씨가 어때?");

        // 맑음과 같은지, 다른지 출력
        System.out.println(answer.equals(answer1));

        double temp = 20;     // 온도
        double humid = 70;    // 습도

        // 현재 온도와 습도를 입력
        String temp1 = JOptionPane.showInputDialog("현재 온도 입력");
        String humid1 = JOptionPane.showInputDialog("현재 습도 입력");

        // Double.parseDouble() 활용 타입 변환
        double temp2 = Double.parseDouble(temp1);
        double humid2 = Double.parseDouble(humid1);

        // 현재 온도가 20도 보다 높고 습도가 70보다 높은지 출력
        System.out.println(temp2 > temp && humid2 > humid);
        JOptionPane.showMessageDialog(null, temp2 > temp && humid2 > humid);

        // 특정 소수점 자리까지 표현 예시
        double d = 123.3454534364634;
        System.out.println((int)d);     // 소수점 아래를 모두 무시 (casting)
        System.out.printf("%.2f", d);   // 소수점 둘째자리까지 반올림하여 표현
    }
}
