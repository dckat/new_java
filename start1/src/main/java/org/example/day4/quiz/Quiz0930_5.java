package org.example.day4.quiz;

import java.util.Random;

public class Quiz0930_5 {
    public static void main(String[] args) {
        // random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
        int[] arr = new int[1000];
        Random r = new Random(555);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        // 80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 80) {
                cnt1++;
            }
            else if (arr[i] >= 70 && arr[i] <= 79) {
                cnt2++;
            }
            else if (arr[i] >= 50 && arr[i] <= 69) {
                cnt3++;
            }
            else if (arr[i] < 49) {
                cnt4++;
            }
        }
        System.out.println("80 이상인 갯수: " + cnt1);
        System.out.println("70~79인 갯수: " + cnt2);
        System.out.println("50~69인 갯수: " + cnt3);
        System.out.println("49보다 작은 갯수: " + cnt4);
    }
}
