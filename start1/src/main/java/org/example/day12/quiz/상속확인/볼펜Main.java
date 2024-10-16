package org.example.day12.quiz.상속확인;

public class 볼펜Main {
    public static void main(String[] args) {
        볼펜 b = new 볼펜(1000, "모나미", 1);
        System.out.println(b);

        b.buy();
        b.write();
    }
}
