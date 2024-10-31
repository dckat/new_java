package org.example.day23.threadbasic;

public class ThreadAnonymous {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("나는 별!!!");
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("나는 샾!!!");
                }
            }
        };

        t1.start();
        t2.start();
    }
}
