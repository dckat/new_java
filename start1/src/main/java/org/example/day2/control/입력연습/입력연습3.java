package org.example.day2.control.입력연습;

import java.util.Scanner;

public class 입력연습3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나의 이름은? ");
        String name = sc.next();
        System.out.print("나의 키는? ");
        double height = sc.nextDouble();
        double nextHeight = height + 11;
        System.out.print("나의 몸무게는? ");
        double weight = sc.nextDouble();
        double nextWeight = weight - 10;
        System.out.print("나는 저녁을 먹었나요? ");
        boolean eat = sc.nextBoolean();
        System.out.print("나의 좌우명은? ");
        sc.nextLine();
        String motto = sc.nextLine();

        System.out.println("내 이름은 " + name + "입니다.");
        System.out.println("내 내년 키는 " + nextHeight + "입니다.");
        System.out.println("내 내년 몸무게는 " + nextWeight + "입니다.");
        System.out.println("나는 저녁을 " + eat + "했습니다.");
        System.out.println("나의 좌우명은 " + motto + "입니다.");
        sc.close();
    }
}
