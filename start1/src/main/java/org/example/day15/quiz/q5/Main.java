package org.example.day15.quiz.q5;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box: " + integerBox.getContent());

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        System.out.println("String Box: " + stringBox.getContent());
    }
}
