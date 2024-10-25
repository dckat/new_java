package org.example.day19.quiz.stream;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1000.0, 2000.0, 3000.0, 4000.0, 5000.0);

        list
                .stream()
                .map(x -> x - 1000.0)
                .forEach(System.out::println);
    }
}
