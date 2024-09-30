package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열에 여러번 입력한 데이터를 넣어주는 패턴
        int[] save = new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자 입력>> ");
            save[i] = sc.nextInt();     // 모든 입력은 String -> int로 변경
        }
        System.out.println(Arrays.toString(save));

        sc.close();     // stream 닫힘. 마지막에 명시해줘야 함.

        /*
        Arrays.sort(save);  // 오름차순 정렬. 맨앞: 최솟값, 맨뒤: 최댓값
        System.out.println("최솟값: " + save[0]);
        System.out.println("최댓값: " + save[save.length - 1]);
        */

        // 해당 인덱스까지 최댓값 저장하는 변수 필요
        int max = save[0];
        // for 순회
        for (int i = 1; i < save.length; i++) {
            if (max < save[i]) {
                max = save[i];
            }   // if
        }   // for
        System.out.println(max);
    }
}
