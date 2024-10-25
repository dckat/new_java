package org.example.day19.quiz.deep.object;

import java.util.ArrayList;
import java.util.List;

public class SortingExample2 {
    public static void main(String[] args) {
        List<Student2> sList = new ArrayList<>();
        sList.add(new Student2("홍길동", 30));
        sList.add(new Student2("신용권", 10));
        sList.add(new Student2("유미선", 20));

        sList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        sList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
