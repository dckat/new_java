package org.example.day4.quiz;

import java.util.Scanner;

public class Quiz0930_4 {
    public static void main(String[] args) {
        // 가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >>
        // 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감
        // 결과 출력은 당신이 가고 싶은 곳인 백두산은 열차를 타고 가야 합니다.
        Scanner sc = new Scanner(System.in);
        String[] ridings = {"열차", "배", "비행기"};
        String[] mountains = {"백두산", "한라산", "후지산"};

        System.out.print("가고 싶은 곳 (보기) 1)백두산, 2)한라산, 3)후지산 입력>> ");
        int num = sc.nextInt();
        sc.close();

        if (num < 0 || num > 3) {
            System.out.println("입력 오류");
        }
        else {
            String riding = ridings[num-1];
            String mountain = mountains[num-1];

            System.out.println("당신이 가고 싶은 곳인 " + mountain + "은 " + riding + "를 타고 가야 합니다.");
        }
    }
}
