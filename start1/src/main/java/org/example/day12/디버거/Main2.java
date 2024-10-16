package org.example.day12.디버거;

public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a,b);
        System.out.println("결과: " + result);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
