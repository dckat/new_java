package org.example.day21.algorithm.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveArray {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {
            // n배열 중 3이상 숫자를 찾아서
            if (n[i] >= 3) {
                // 10을 곱한 후 list에 모은 후
                list.add(n[i]*10);
            }
        }
        // 배열에 옮긴 후
        int size = list.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        // 정렬 후 출력
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
