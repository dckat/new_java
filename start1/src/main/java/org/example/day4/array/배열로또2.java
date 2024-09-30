package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열로또2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        // 랜덤한 값 6개
        Random r = new Random();

        // 범위는 1부터 45까지
        for (int i = 0; i < lotto.length; i++) {    // 6번만 무조건 발생
            // 중복된 값 확인 논리변수
            boolean check = false;
            int x = r.nextInt(45) + 1;
            for (int x2 : lotto) {  // 배열안에 동일한 값이 있는지 비교하는 반복문
                if (x == x2) {
                    System.out.println("중복된 값 존재");
                    check = true;
                    break;
                }
            }
            // 중복 여부
            if (check) {
                i--;
            }
            else {
                lotto[i] = x;
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}
