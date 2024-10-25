package org.example.day19.quiz.basic;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("치킨", "피자", "삼겹살", "햄버거", "맥주", "족발", "떡볶이");

        list.stream()
                .filter(x -> x.length() >= 3)
                .forEach(x -> System.out.println(x));
    }
}
