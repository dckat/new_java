package org.example.day2.control.입력연습;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 2개를 입력받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a > b);

        sc.close();
    }
}
