package org.example.day12.quiz.thread;

public class MultiThread3 {
    public static void main(String[] args) {
        CounterThread ct = new CounterThread();
        DateThread dt = new DateThread();
        StringThread st = new StringThread();

        ct.start();
        dt.start();
        st.start();
    }
}
