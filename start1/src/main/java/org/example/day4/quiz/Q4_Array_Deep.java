package org.example.day4.quiz;

import java.util.Scanner;

public class Q4_Array_Deep {
    public static void main(String[] args) {
        int[] seat = new int[10];
        int input;
        int reserve = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("현재 좌석 상태:");
            for (int i = 0; i < seat.length; i++) {
                System.out.print(i+1 + ":" + seat[i] + " ");
            }
            System.out.print("\n");
            System.out.print("예매할 좌석 번호를 입력하세요 (종료하려면 0 입력): ");
            input = sc.nextInt();

            if (input == 0) {
                System.out.println("예매된 좌석 수: " + reserve);
                System.out.println("총 예매 금액: " + (reserve*10000) + "원");
                break;
            }
            else if (input >= 1 && input <= 10) {
                if (seat[input-1] == 0) {
                    System.out.println(input + "번 좌석이 예매되었습니다.");
                    seat[input-1] = 1;
                    reserve++;
                }
                else {
                    System.out.println("이미 예매된 좌석입니다.");
                }
            }
        }
    }
}
