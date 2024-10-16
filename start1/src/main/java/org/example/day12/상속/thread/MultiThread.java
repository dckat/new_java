package org.example.day12.상속.thread;

public class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
