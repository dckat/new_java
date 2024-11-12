package org.example.day23.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedSizeThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " 스레드 실행 중 " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // 작업을 1초 동안 실행
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskNumber + " 인터럽트되어 중단");
                }
                System.out.println("Task " + taskNumber + " 스레드 실행 완료");
            });
        }
        // 모든 작업이 완료되면 스레드 풀 종료
        executor.shutdown();
        System.out.println("스레드 풀 셧다운");
    }
}
