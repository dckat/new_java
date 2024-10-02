package org.example.day5.array2;

import java.util.Arrays;

public class StringQ1 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        // 1. String[]으로 변경
        String[] subject = all.split(", ");
        System.out.println(Arrays.toString(subject));
        // 2. 바꾸었을때 공백이 포함되어 있다면, 공백을 모두 제거하고 배열에 넣으세요
        for (int i = 0; i < subject.length; i++) {
            subject[i] = subject[i].trim();
        }
        // 3. 과목수는?
        System.out.println("과목수는 " + subject.length + "과목");
        // 4. 컴퓨터의 위치는?
        // 5. 과목명이 3글자 미만인 과목수는?
        int cnt = 0;
        for (int i = 0; i < subject.length; i++) {
            if (subject[i].equals("컴퓨터")) {
                System.out.println("컴퓨터의 위치는 인덱스>>> " + i);
            }
            if (subject[i].length() < 3) {
                cnt++;
            }
        }
        System.out.println("3글자 미만 과목수는>> " + cnt);
    }
}
