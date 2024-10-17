package org.example.day13.quiz.thread;

public class ThreadUse2 {
    public static void main(String[] args) {
        TimeThread t = new TimeThread();
        EvenThread e = new EvenThread();

        t.start();
        e.start();
    }
}
