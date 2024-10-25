package org.example.day19.quiz.stream;

import java.util.Arrays;

public class Stream2 {
    public static void main(String[] args) {
        double[] list2 = {11.1, 22.2, 33.3, 44.4};

        System.out.println(
                Arrays.stream(list2)
                        .map(x -> x + 10.0)
                        .sum());

    }
}
