package org.example.day23.threadbasic;

public class ThreadMain2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadGenerate());
        Thread t2 = new Thread(new ThreadGenerate2());

        t1.start();
        t2.start();
    }
}
