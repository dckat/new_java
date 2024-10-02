package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        // 이름 배열
        String[] name = {"아이유", "유재석", "BTS"};
        // 투표수 배열
        int[] tv = new int[3];  // {0,0,0}

        Scanner sc = new Scanner(System.in);    // 자바코드<-연결스트림 오픈->콘솔
        while (true) {
            System.out.println("인기투표 1)아이유, 2)유재석, 3)방탄소년단, 4)종료");
            System.out.print("선택번호>> ");
            int num = sc.nextInt();

            // 무한루프인 경우 종료시점 반드시 명시
            if (num == 4) {
                System.out.println("종료합니다.");
                break;
            }

            switch (num) {
                case 1:
                    System.out.println("아이유가 한표 획득!");
                    tv[0]++;
                    break;
                case 2:
                    System.out.println("유재석이 한표 획득!");
                    tv[1]++;
                    break;
                case 3:
                    System.out.println("방탄소년단이 한표 획득!");
                    tv[2]++;
                    break;
                default:
                    System.out.println("잘못된 값 입력");
            }
        }
        int sum = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + ": " + tv[i] +"표");
            sum += tv[i];
        }
        System.out.println("전체 투표수: " + sum + "회");
        sc.close();
    }
}
