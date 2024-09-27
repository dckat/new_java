package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        // 의사 임시값
        Random r = new Random(100);     // Random: 임의의 값을 만들어주는 클래스
        // r.setSeed(100);                    // 씨드값을 지정

        // 반복문을 만들 때 -> 유한반복/무한반복
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(100);       // 0 ~ 99
            int num2 = r.nextInt(100) + 1;  // 1 ~ 100

            System.out.println(num);
            System.out.println(num2);
        }
    }
}
