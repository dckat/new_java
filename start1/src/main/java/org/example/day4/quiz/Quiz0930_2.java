package org.example.day4.quiz;

import java.util.Scanner;

public class Quiz0930_2 {
    public static void main(String[] args) {
        /* 2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍
              숫자입력: 55
              숫자입력: 77
              숫자입력: 11
              -------------
              합계: 133
              평균: 44.33333
        */
        int[] a = new int[3];
        int sum = 0;
        double avg = 0.0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("숫자 입력: ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();

        avg = sum / (double)a.length;
        System.out.println("-----------------");
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
