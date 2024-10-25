package org.example.day19.quiz.basic;

import java.util.Arrays;
import java.util.List;

public class Stream6 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);

        int min = list2.stream()
                .distinct()
                .sorted()
                .mapToInt(Integer::intValue)
                .min().orElse(0);
        System.out.println(min);
    }
}
