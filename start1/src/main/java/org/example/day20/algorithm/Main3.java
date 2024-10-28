package org.example.day20.algorithm;

public class Main3 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        int num1 = 3;
        int num2 = 2;
        System.out.println(s3.solution(num1, num2));
    }
}

class Solution3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * 1000 / num2;
        return answer;
    }
}