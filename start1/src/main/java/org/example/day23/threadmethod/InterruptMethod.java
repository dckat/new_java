package org.example.day23.threadmethod;

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000);
            System.out.println("Thread is awake!");
        } catch (InterruptedException e) {
            System.out.println("내가 깨어났다...");
        }
    }
}

public class InterruptMethod {
    public static void main(String[] args) {
        // 쓰레드 객체 생성
        // 2초후에
        // Interrupt로 Thread 객체 깨우기
        // ==> 실행 대기 상태로
        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("오류");
        }
        t.interrupt();
    }
}
