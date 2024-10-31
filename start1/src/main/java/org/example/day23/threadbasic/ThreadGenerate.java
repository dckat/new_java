package org.example.day23.threadbasic;

public class ThreadGenerate implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("나는 별!!!");
        }
    }
}
