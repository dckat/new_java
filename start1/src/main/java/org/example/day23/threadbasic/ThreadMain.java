package org.example.day23.threadbasic;

public class ThreadMain {
    public static void main(String[] args) {
        // Thread 객체 생성
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        // 메인스레드와 함께 3개의 스레드를 동시에 처리하는 목록으로 등록
        t1.start();
        t2.start();
        t3.start();
    }
}
