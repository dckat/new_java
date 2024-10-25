package org.example.day19.quiz.basic;

import java.util.Arrays;
import java.util.List;

public class Stream4 {
    public static void main(String[] args) {
        String[] places = {"백두산", "서울", "제주도", "북한산", "부산"};

        List<String> result =  Arrays.stream(places)
                .filter(x -> x.endsWith("산"))
                .peek(x -> System.out.println(x))
                .toList();

        System.out.println(result);

    }
}
