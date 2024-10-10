package org.example.day8.class사용;

import org.example.day8.class만들기.계산기2;

import java.util.Arrays;
// import java.lang.*;      --> import 없이도 사용가능한 라이브러리

public class 계산기2사용 {
    public static void main(String[] args) {
        계산기2 cal = new 계산기2();

        // 계산기2의 모든 메소드를 호출하여 변수에 넣은 후 출력
        int result1 = cal.add(100, 200);
        double result2 = cal.add(100, 222.2);
        double result3 = cal.add(111.1, 222.2);
        String result4 = cal.add("오늘은 ", 10);
        int[] result5 = cal.add();
        int result6 = cal.call();

        System.out.println(result1 + " " + result2);
        System.out.println(result3);
        System.out.println(result4 + "일입니다.");
        System.out.println(result5[0]);
        // 배열 전체 값 출력 3가지
        // 1. for(int i~)
        // 2. for(int x: 배열명)
        // 3. Arrays.toString(배열명)
        System.out.println(Arrays.toString(result5));
        System.out.println("오늘은 " + result6 + "월입니다.");
    }
}
