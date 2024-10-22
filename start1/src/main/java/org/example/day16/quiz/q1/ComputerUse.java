package org.example.day16.quiz.q1;

public class ComputerUse {
    public static void main(String[] args) {
        Computer c1 = new AppleComputer();
        Computer c2 = new BananaComputer();

        System.out.println("-------애플컴퓨터-------");
        c1.start();
        c1.shutdown();
        c1.restart();

        System.out.println("-------바나나컴퓨터-------");
        c2.start();
        c2.shutdown();
        c2.restart();
    }
}
