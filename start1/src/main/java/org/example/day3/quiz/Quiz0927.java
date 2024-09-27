package org.example.day3.quiz;

import java.util.Arrays;

public class Quiz0927 {
    public static void main(String[] args) {
        // 1. 정수배열을 만들어 11.22.33.44.55를 저장 (처음부터 값을 알고 있음)
        int[] arr = {11, 22, 33, 44, 55};
        // 1-1. 첫번째 값 출력
        System.out.println(arr[0]);
        // 1-2. 세번째 값 출력
        System.out.println(arr[2]);
        // 1-3. 마지막 값 출력
        System.out.println(arr[arr.length - 1]);
        // 1-4. 전체 출력
        System.out.println(Arrays.toString(arr));

        // 2. 실수배열을 만들어 11.1, 22.2, 33.3을 저장 (처음부터 값을 알고 있음)
        double[] arr2 = {11.1, 22.2, 33.3};
        // 2-1. 첫번째 값과 두번째 값을 더하여 출력
        System.out.println(arr2[0] + arr2[1]);
        // 2-2. 첫번째 값과 마지막 값을 더하여 출력
        System.out.println(arr2[0] + arr2[arr2.length - 1]);
        // 2-3. 배열에 들어있는 전체 갯수를 출력
        System.out.println("전체 갯수: " + arr2.length);
        // 2-4. 전체 출력
        System.out.println(Arrays.toString(arr2));

        // 3. 갯수가 4개인 문자(char) 배열을 생성 (값을 모르는 경우)
        char[] arr3 = new char[4];
        // 3-1. 첫 번째 위치에 '남'을 넣어 출력
        arr3[0] = '남';
        System.out.println(arr3[0]);
        // 3-2. 두 번째 위치에 '여'를 넣어 출력
        arr3[1] = '여';
        System.out.println(arr3[1]);
        // 3-3. 전체 갯수와 전체 배열의 값 출력
        System.out.println("전체 갯수: " + arr3.length);
        System.out.println(Arrays.toString(arr3));

        // 4. 갯수가 3개인 문자열 배열을 생성 (값을 모르는 경우)
        String[] arr4 = new String[3];
        // 4-1. 각 자리에 제일 가고 싶은 세곳을 넣어 저장
        arr4[0] = "오사카";
        arr4[1] = "제주도";
        arr4[2] = "LA";
        // 4-2. 전체 출력
        System.out.println(Arrays.toString(arr4));
        // 4-3. 내가 첫번째 가고 싶은 곳과 마지막 가고 싶은 곳 출력
        System.out.println("내가 첫 번째 가고 싶은 곳은 " + arr4[0] + "이고,\n"
        + "마지막 가고 싶은 곳은 " + arr4[arr4.length - 1] + "이다.");
    }
}
