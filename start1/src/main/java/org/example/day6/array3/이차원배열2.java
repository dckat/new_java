package org.example.day6.array3;

public class 이차원배열2 {
    public static void main(String[] args) {
        // 2차원배열: 처음에 값을 모르는 경우
        int[][] n2 = new int[3][];  // 생성변수: 5개
        System.out.println(n2.length);
        // 총 메모리(참조형은 4바이트) ==> n2, n2[0], n2[1], n2[2], n2.length => 20바이트
        System.out.println(n2[0]);
        System.out.println(n2);
        // 1차원 배열 3개를 만들어서 저장
        int[] r0 = new int[10];
        int[] r1 = new int[15];
        int[] r2 = new int[12];
        System.out.println(r0);
        n2[0] = r0;
        n2[1] = r1;
        n2[2] = r2;
        System.out.println(n2[0].length);

        // n2를 한 행당 가로 한 줄로 출력
        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[i].length; j++) {
                System.out.print(n2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
