package org.example.day19.quiz.deep.object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        sList.add(new Student("홍길동", 30));
        sList.add(new Student("신용권", 10));
        sList.add(new Student("유미선", 20));

        sList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        sList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
