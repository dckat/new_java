package org.example.day21.algorithm.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        // 대 --> 소
        // 소문자는 z~~a
        // 소문자 앞 + 대문자 뒤
        // 오름차순정렬 후 뒤집기
        char[] c = s.toCharArray();
        Arrays.sort(c); // 오름차순 정렬
        // 1. Collection으로 만들어서 뒤집어도 되고
        // 2. sb로 넣어서 뒤집어도 됨.
        String s2 = new String(c);
        // char로 String 생성 가능
        StringBuilder sb = new StringBuilder(new String(c));
        String result = sb.reverse().toString();
        System.out.println(result);
    }
}
