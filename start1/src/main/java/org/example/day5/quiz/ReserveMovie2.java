package org.example.day5.quiz;

import java.util.Scanner;

public class ReserveMovie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] reserved = new int[3][10];
        int cnt = 0;
        while (true) {
            System.out.println("------------------------------------------");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            System.out.println("------------------------------------------");
            for (int i = 0; i < reserved.length; i++) {
                for (int j = 0; j < reserved[i].length; j++) {
                    System.out.print(reserved[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.print("예메 1, 종료 0>> ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("예매 시스템을 종료합니다.");
                System.out.println("당신의 총 예매수는 " + cnt + "매");
                System.out.println("당신의 총 금액은 " + cnt*10000 + "원");
                break;
            }
            else if (input == 1) {
                System.out.print("예매할 좌석 행번호: >>> ");
                int row = sc.nextInt();
                System.out.print("예매할 좌석 열번호: >>> ");
                int col = sc.nextInt();
                if (reserved[row][col] == 1) {
                    System.out.println("이미 예매가 된 좌석입니다.");
                    continue;
                }
                else {
                    reserved[row][col] = 1;
                    cnt++;
                    System.out.println("예매 완료");
                }
            }
        }
        sc.close();
    }
}
