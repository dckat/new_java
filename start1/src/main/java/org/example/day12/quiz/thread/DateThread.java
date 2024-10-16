package org.example.day12.quiz.thread;

import java.util.Date;

public class DateThread extends Thread {
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.println(new Date());
        }
    }
}
