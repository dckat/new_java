package org.example.day19.quiz.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Stream4 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream is = random.ints(100, 3500, 4000);

        is.distinct().sorted().forEach(System.out::println);
    }
}
