package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴 {
    public static void main(String[] args) {
        // 1. 배열 생성 후 반복문으로 데이터를 넣기
        int[] jumsu = new int[5];             // {0,0,0,0,0}
        Random r = new Random(100);     // 임의의 값을 만들어주는 부품
        for (int i = 0; i < jumsu.length; i++) {
            // jumsu[i] = r.nextInt();          // 범위: int의 전체 범위 (약 -21억 ~ 약 21억)
            jumsu[i] = r.nextInt(100);  // 범위: 0 ~ 99
        }
        System.out.println(Arrays.toString(jumsu));

        // 2. 배열에 있는 값을 꺼내어 누적
        int sum = 0;    // 누적변수는 반복문에 넣지 않음
        for (int x : jumsu) {
            // 앞의 sum: 새로운 값까지 누적된 값
            // 뒤의 sum: 이전까지 더해진 값
            sum = sum + x;  // + 먼저 실행하고 = 실행
        }
        System.out.println(sum);

        // 3. 배열에 있는 값을 반복하여 처리 (조건이 있는 경우)
        int sum2 = 0;
        for (int x : jumsu) {
            if (x >= 80) {
                sum2 = sum2 + x;    // sum2 += x;
                int y = 0;          // 선언의 위치 -> 변수가 사용될 수 있는 범위
            }
        }
        // 코드정리 (코드 포맷팅)
        System.out.println(sum2);

        // 4. 배열에 있는 값을 가지고 위치 탐색 (코딩테스트에서 자주 활용)
        for (int i = 0; i < jumsu.length; i++) {
            // 88이 하나만 있는 경우 break
            if (jumsu[i] == 88) {
                System.out.println("88 찾음.");
                System.out.println(i + 1 + "번째에 있음.");
                break;      // 반복문에 대한 break
            }
        }
    }
}
