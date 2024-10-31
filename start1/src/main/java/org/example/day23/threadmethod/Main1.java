package org.example.day23.threadmethod;

class Sum {
    private int sum = 0;
    public synchronized void sum(int n) {
        sum += n;
    }
    public int getSum() {
        return sum;
    }
}


public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Sum s = new Sum();

        // 스레드1은 1부터 100까지 Sum클래스의 sum메서드를 호출하여 sum변수에 더하는 처리
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                s.sum(i);
            }
        });
        // 스레드2는 2부터 200까지 Sum클래스의 sum메서드를 호출하여 sum변수에 더하는 처리
        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 200; i++) {
                s.sum(i);
            }
        });

        // 최종 sum값을 getSum을 통해 프린트
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("sum: " + s.getSum());
    }
}