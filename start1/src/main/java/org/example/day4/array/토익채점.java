package org.example.day4.array;

import java.util.Random;

public class 토익채점 {
    public static void main(String[] args) {
        // 1. 답안 배열, 내답 배열 생성
        int[] ans = new int[990];
        int[] mark = new int[990];

        // 2. Random 활용 배열에 990개의 값을 저장 (범위: 1~4)
        Random r = new Random();
        for (int i = 0; i < ans.length; i++) {
            ans[i] = r.nextInt(4) + 1;
            mark[i] = r.nextInt(4) + 1;
        }

        // 3. 답안과 내답의 인덱스를 비교해서 맞으면 1점 추가
        int score = 0;
        System.out.println("번호:\t답안\t내답");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(i + "\t\t" + ans[i] + "\t" + mark[i]);
            if (ans[i] == mark[i]) {
                score++;
            }
        }

        // 4. 총점 출력
        System.out.println("점수:\t" + score);
    }
}
