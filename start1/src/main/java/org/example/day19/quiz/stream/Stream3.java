package org.example.day19.quiz.stream;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class Stream3 {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream is = IntStream.rangeClosed(1500, 3500);

        // OptionalDouble: 값이 존재하는지까지 확인하는 클래스 객체
        OptionalDouble avg = is.average();

        if (avg.isEmpty()) {
            System.out.println("결과값이 없음.");
        }
        else {
            System.out.println(avg.getAsDouble());
        }

        double avg2 = IntStream.rangeClosed(1500, 3500).average().orElse(0);
        System.out.println(avg2);
    }
}
