package org.example.day10.정규표현식;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 회사 직원 정보를 입력 받기 (sc.next())
        // 한글입력, 3-4글자
        // 제대로 입력했으면 "[이름]님 환영합니다" / 아니면 "다시 입력해야합니다" 출력
        System.out.print("이름 입력>> ");
        String name = sc.next();
        if (Pattern.matches("^[가-힣]{3,4}$",name)) {
            System.out.println(name + "님 환영합니다.");
        }
        else {
            System.out.println("다시 입력해야합니다.");
        }
        // 숫자만으로 이루어졌는지 확인
        // 숫자로 이루어졌으면 int로 변환 후, 만으로 계산(-1)후 출력
        System.out.print("나이 입력>> ");
        String age = sc.next();

        if (Pattern.matches("^[0-9]+$", age)) {
            int age2 = Integer.parseInt(age) - 1;
            System.out.println("만 나이는 " + age2);
        }
        else {
            System.out.println("숫자만 입력해야 합니다.");
        }
        // 영문+숫자+_(언더바, 밑줄)포함한 글자 5-8글자
        // new.com을 포함하고 있어야 함.
        // 유효하면 "이메일이 유효합니다."
        // 유효하지 않으면 "이메일이 유효하지 않습니다."
        System.out.print("이메일 입력>> ");
        String email = sc.next();

        if (Pattern.matches("^[a-zA-Z0-9_]{5,8}@new\\.com", email)) {
            System.out.println("이메일이 유효합니다.");
        }
        else {
            System.out.println("이메일이 유효하지 않습니다.");
        }
        sc.close();
    }
}
