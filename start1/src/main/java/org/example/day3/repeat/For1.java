package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        // 3번 환영합니다. 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("환영합니다.");
        }

        // 숫자를 100부터 200까지 출력
        for (int i = 100; i <= 200; i++) {
            System.out.println("현재 숫자: " + i);
        }

        // Random한 정수값 5개 출력 (범위는 0 ~ 99)
        Random random = new Random();
        for (int i = 0; i < 5; i++) {   // 0,1,2,3,4
            int num = random.nextInt(100);
            System.out.println("랜덤값: " + num);
        }
    }   // main
}   // class
