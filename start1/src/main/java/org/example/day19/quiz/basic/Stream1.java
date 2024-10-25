package org.example.day19.quiz.basic;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream is = r.ints(100, 111, 223).sorted();
        List<Integer> list = is.boxed().collect(Collectors.toList());
        int max = list.get(list.size() - 1);
        int min = list.get(0);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double avg = sum / (double)list.size();

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);

        System.out.println("---------------------");
        max = list.stream()
                .mapToInt(Integer::intValue)
                .max().orElse(0);
        min = list.stream()
                .mapToInt(Integer::intValue)
                .min().orElse(0);
        sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        avg = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
