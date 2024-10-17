package org.example.day13.quiz.thread;

import java.util.Date;

public class TimeThread extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            Date date = new Date();
            int hour = date.getHours();
            int minute = date.getMinutes();
            int second = date.getSeconds();
            System.out.println("시각 >> " + hour + ":" + minute + ":" + second);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}
