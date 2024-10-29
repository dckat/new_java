package org.example.day21.algorithm.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideZero {
    public static void main(String[] args) {
        int[] n = {5, 9, 7, 10};
        int divisor = 5;
        Solution4 s = new Solution4();
        int[] a = s.solution(n, divisor);
        System.out.println(Arrays.toString(a));
    }
}

class Solution4 {
    public int[] solution(int[] n, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] % divisor == 0) {
                list.add(n[i]);
            }
        }
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = 1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
