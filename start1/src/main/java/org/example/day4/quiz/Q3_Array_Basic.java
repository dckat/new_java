package org.example.day4.quiz;

import java.util.Scanner;

public class Q3_Array_Basic {
    public static void main(String[] args) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택> ");
            input = sc.nextInt();

            if (input == 5) {
                System.out.println("프로그램 종료");
                break;
            }
            else if (input == 1) {
                System.out.print("학생수> ");
                int num = sc.nextInt();
                arr = new int[num];
            }
            else if (input == 2) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    int num = sc.nextInt();
                    arr[i] = num;
                }
            }
            else if (input == 3) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("scores[" + i + "]: " + arr[i]);
                }
            }
            else if (input == 4) {
                int max = arr[0];
                double avg = 0.0;

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    avg += arr[i];
                }
                avg /= (double)arr.length;

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }
        }
        sc.close();
    }
}
