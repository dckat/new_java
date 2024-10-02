package org.example.day5.quiz;

import java.util.Scanner;

public class ReserveMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] reserved = new int[10];
        int cnt = 0;
        while (true) {
            System.out.println("------------------------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            System.out.println("------------------------------------------");
            for (int i = 0; i < reserved.length; i++) {
                System.out.print(reserved[i] + "\t");
            }
            System.out.println();
            System.out.print("예매할 좌석 번호를 입력(종료 0번>>>) ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("예매 시스템을 종료합니다.");
                System.out.println("당신의 총 예매수는 " + cnt + "매");
                System.out.println("당신의 총 금액은 " + cnt*10000 + "원");
                break;
            }
            else if (input >= 1 && input <= 10) {
                if (reserved[input - 1] == 1) {
                    System.out.println("이미 예매가 된 좌석입니다.");
                    continue;
                }
                else {
                    reserved[input - 1] = 1;
                    cnt++;
                    System.out.println("예매 완료");
                }
            }
        }
        sc.close();
    }
}
