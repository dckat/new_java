package org.example.day20.algorithm;

public class Main5 {
    public static void main(String[] args) {
        int angle = 70;
        int answer = 0;

        if (angle > 0 && angle < 90) {
            answer = 1;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if (angle > 90 && angle < 180) {
            answer = 3;
        }
        else if (angle == 180) {
            answer = 4;
        }
        System.out.println(answer);
    }
}
