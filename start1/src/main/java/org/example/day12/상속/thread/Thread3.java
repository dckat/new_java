package org.example.day12.상속.thread;

public class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("* 찍기 " + (i + 1) + "회");
        }
    }
}
