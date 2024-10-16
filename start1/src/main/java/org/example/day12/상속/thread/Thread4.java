package org.example.day12.상속.thread;

public class Thread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("김대철 출력 " + (i+1) + "회");
        }
    }
}
