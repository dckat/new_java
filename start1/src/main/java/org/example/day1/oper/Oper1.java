package org.example.day1.oper;

import javax.swing.*;

public class Oper1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("당신의 이름을 입력하시오.");
        String age = JOptionPane.showInputDialog("당신의 나이를 입력하시오.");    // 입력값을 문자열로 인식

        // 문자열을 정수로 변환하여 int 변수에 저장
        int age2 = Integer.parseInt(age.replaceAll(" ", ""));

        System.out.println(name + " " + age2);
        // age2에 1을 더해서 age3에 저장하고 출력
        int age3 = age2 + 1;                // 상황에 따라 long을 써도 문제 X

        // 피연산자 중 하나가 문자열이면 + 연산자의 결과는 문자열
        System.out.println("내년 나이는 " + age3);
    }
}
