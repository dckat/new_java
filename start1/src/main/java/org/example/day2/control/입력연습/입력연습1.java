package org.example.day2.control.입력연습;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {
        // 참고) 수동 import(윈도우): alt + enter
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력>> ");
        String name = sc.next();        // 한 단어만 입력 (스페이스바 <- 단어구분)
        System.out.print("나이 입력>> ");
        int age = sc.nextInt();         // 문자열로 입력 받은것을 정수로 변환
        System.out.print("몸무게 입력>> ");
        double w = sc.nextDouble();     // 문자열로 입력 받은것을 실수로 변환
        System.out.println(name + " " + age + " " + w);
        sc.close();                     // 스트림 닫기 (작업이 끝나면 해제를 해주어야 함)
    }
}
