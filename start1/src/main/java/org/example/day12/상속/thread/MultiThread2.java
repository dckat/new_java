package org.example.day12.상속.thread;

public class MultiThread2 {
    public static void main(String[] args) {
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();

        t3.start();
        t4.start();
    }
}
