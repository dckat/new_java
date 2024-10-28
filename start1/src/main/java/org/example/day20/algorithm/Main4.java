package org.example.day20.algorithm;

public class Main4 {
    public static void main(String[] args) {
        int input = 10;
        int answer = 0;
        for (int i = input; i > 0; i--) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
