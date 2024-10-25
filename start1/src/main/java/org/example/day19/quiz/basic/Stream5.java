package org.example.day19.quiz.basic;

import java.util.Arrays;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);

        double max = list.stream()
                .mapToDouble(Double::doubleValue)
                .max().orElse(0.0);
        System.out.println(max);

        double min = list.stream()
                .mapToDouble(Double::doubleValue)
                .min().orElse(0.0);
        System.out.println(min);

        double sum = list.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println(sum);

        double avg = list.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.0);
        System.out.println(avg);
    }
}
