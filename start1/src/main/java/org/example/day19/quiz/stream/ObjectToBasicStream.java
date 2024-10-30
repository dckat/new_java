package org.example.day19.quiz.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ObjectToBasicStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300);
        List<Double> list2 = Arrays.asList(100.0, 200.0, 300.0);
        // 스트림으로 만들어서 평균 구하고. 합 구하고. 최댓값도 구하기
        // Stream<Integer> ==> [주소, 주소, 주소]
        OptionalDouble avg1 = list.stream().mapToInt(Integer::intValue).average();
        if (avg1.isPresent()) {
            System.out.println("평균>> " + avg1.getAsDouble());
        }
        else {
            System.out.println("평균을 구할 수 없음.");
        }

        // 없을 때 기본값을 설정하면 바로 추출 가능
        double avg2 = list2.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avg2);

        list2.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .ifPresent(x -> System.out.println(x));
    }
}