package org.example.day4.quiz;

import java.util.Arrays;
import java.util.Random;

public class Quiz0930_3 {
    public static void main(String[] args) {
        int[] n = new int[1000];

        // random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
        Random r = new Random(44);
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
        }
        System.out.println(Arrays.toString(n));

        // 3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
        // 3-2. 전체 합계와 평균 출력
        int sum1 = 0, sum2 = 0;
        double avg = 0;
        for (int i = 0; i < n.length; i++) {
            if (i == 0) {
                sum1 += n[i];
            }
            if (i == 2) {
                sum1 += n[i];
            }
            if (i == 4) {
                sum1 += n[i];
            }
            if (i == 99) {
                sum1 += n[i];
            }
            if (i == 989) {
                sum1 += n[i];
            }
            sum2 += n[i];
        }
        avg = (double)sum2 / n.length;
        System.out.println("선택된 값의 합: " + sum1);
        System.out.println("전체 합: " + sum2);
        System.out.println("전체 평균: " + avg);
    }
}
