package org.example.day19.quiz.basic;

import java.util.Random;

public class Stream2 {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(r.doubles(200, 11.1, 55.5)
                .count());

        System.out.println(r.doubles(200, 11.1, 55.5)
                .findFirst().getAsDouble());

        System.out.println(r.doubles(200, 11.1, 55.5)
                .average().getAsDouble());
    }
}
