package org.example.day3.array;

public class Array1 {
    public static void main(String[] args) {
        // 배열을 만드는 방법 2가지
        // 1. 처음에 값을 모르는 경우
        int[] s = new int[5]; // {0,0,0,0,0}으로 초기화 되어 생성
        System.out.println("첫 번째 값: " + s[0]);
        System.out.println("두 번째 값: " + s[1]);

        // 첫 번째 값을 수정하여 출력
        s[0] = 100;
        System.out.println("첫 번재 값: " + s[0]);

        // 2. 처음부터 값을 알고 있는 경우
        int[] s2 = {100, 200, 300, 400, 500};   // 추가로 갯수가 별도로 저장 (length)
        System.out.println("첫 번째 값: " + s2[0]);
        System.out.println("두 번째 값: " + s2[1]);
        System.out.println("s2 크기: " + s2.length);          // 배열의 길이를 출력
    }
}
