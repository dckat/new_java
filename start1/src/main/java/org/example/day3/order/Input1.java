package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력>> ");   // println(), printf() <- 그 외 자주 사용되는 것들
        int age = sc.nextInt();   // 모든 입력은 컴퓨터는 타입을 String으로 인식 -> int로 변경
        System.out.print("아침을 먹었는지 입력(true/flase)? ");
        boolean result = sc.nextBoolean();

        // 처리 ==> cpu
        int nextAge = age + 1;
        String text = null;     // 기본형이 아닌 것들은 주소가 없음을 뜻하는 null로 초기화
        if (result == true) {
            text = "점심을 조금 먹어도 되겠네요.";
        } else {
            text = "점심을 많이 먹어야 되겠네요.";
        }

        // 출력
        System.out.println("내년 나이는 " + nextAge + "세");
        System.out.println("아침 식사 여부 결과: " + text);
    }
}
