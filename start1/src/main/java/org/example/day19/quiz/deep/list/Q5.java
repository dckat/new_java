package org.example.day19.quiz.deep.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> result1 = numbers.stream()
                .map(x -> x * 3)
                .toList();

        System.out.println(result1);

        List<Integer> result2 = result1.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(result2);

        List<Double> result3 = result2.stream()
                .map(x -> Math.sqrt(x))
                .toList();
        System.out.println(result3);

        result3.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
