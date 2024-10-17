package org.example.day13.예외처리;

public class ArrayErrorHandleMain2 {
    public static void main(String[] args) {
        ArrayError2 ar2 = new ArrayError2();
        try {
            ar2.array();
        } catch (Exception e) {
            System.out.println("배열 예외처리");
        }
        System.out.println("실행시켜줘...");
        System.out.println("실행시켜줘...");
        System.out.println("실행시켜줘...");
        System.out.println("실행시켜줘...");
        System.out.println("실행시켜줘...");
        System.out.println("실행시켜줘...");
    }
}