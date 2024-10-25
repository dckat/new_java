package org.example.day19.stream;

import java.util.ArrayList;
import java.util.List;

public class GenerateStream {
    public static void main(String[] args) {
        // 컬렉션, 배열, 파일, 랜덤하게 만들수 있음.
        // 1. 컬렉션
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
        list
                .stream()
                .map(x -> x + 100)
                .forEach(x -> System.out.println(x));

        System.out.println(list
                .stream()
                .map(x -> x + 100)
                .mapToInt(Integer::intValue)  // x -> Integer.intValue(x) 와 같음
                .sum());

        //.mapToInt(Integer::intValue) ==>
        //.mapToInt(x -> Integer.intValue(x)) : intStream
    }
}
