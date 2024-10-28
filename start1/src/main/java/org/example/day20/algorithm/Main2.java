package org.example.day20.algorithm;

public class Main2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        int num = 98;
        int n = 2;
        System.out.println(s2.solution(num, n));
    }
}

class Solution2 {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            answer = 1;
        }
        return answer;
    }
}
