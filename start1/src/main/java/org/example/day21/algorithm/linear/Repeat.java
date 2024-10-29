package org.example.day21.algorithm.linear;

public class Repeat {
    public static void main(String[] args) {
        // 무한반복 while(true)
        // 유한반복 while. for
        //  --> 시작값. 증감값. 조건식(종료시점)
        for (int i = 0; i < 3; i++) {
            System.out.println("밥먹을시간");
        }

        int j = 0;
        while (j < 3) {
            System.out.println("나가자!!");
            j++;
        }

        int j2 = 3;
        while (j2 > 0) {
            System.out.println("나가자. 지금");
            j2--;
        }
    }
}
