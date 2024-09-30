package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열로또 {
    public static void main(String[] args) {
        int[] lotto = new int[1000];
        // 랜덤한 값 (시드: 42)
        Random r = new Random(42);

        // 범위는 1부터 45까지
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45) + 1;
        }
        System.out.println(Arrays.toString(lotto));

        int cnt = 0;
        for (int x : lotto) {
            if (x >= 15) {
                cnt++;      // cnt = cnt + 1;
            }
        }
        System.out.println(cnt);
    }
}
