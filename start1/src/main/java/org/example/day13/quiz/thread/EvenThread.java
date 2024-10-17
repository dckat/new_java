package org.example.day13.quiz.thread;

public class EvenThread extends Thread {
    public void run() {
        for (int i = 100; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println("카운터 >> " + i);
            }
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}
