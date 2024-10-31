package org.example.day23.threadbasic;

public class Thread1 extends Thread {
    // start() --> 동시에 실행할 목록으로 이 스레드를 넣어주기
    // run() --> 동시에 실행해주는 내용

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("*");
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println("Sleep 중 Error 발생");
            }
        }
    }
}
