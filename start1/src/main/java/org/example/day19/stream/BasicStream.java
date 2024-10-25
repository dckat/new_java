package org.example.day19.stream;

import java.util.Arrays;

public class BasicStream {
    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        // int[] ==> IntStream[정수, 정수, 정수]
        Arrays.stream(n)
                .forEach(System.out::println);

        System.out.println(
                Arrays.stream(n)
                        .sum()
        );
    }
}
