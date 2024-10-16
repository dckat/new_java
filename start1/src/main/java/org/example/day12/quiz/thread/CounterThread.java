package org.example.day12.quiz.thread;

public class CounterThread extends Thread {
    public void run() {
        for (int i = 500; i > 0; i--) {
            System.out.println(i);
        }
    }
}
