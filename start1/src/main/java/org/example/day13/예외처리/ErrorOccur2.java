package org.example.day13.예외처리;

public class ErrorOccur2 {
    public void call() {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("예외처리 내가함.");
        }
    }
}
