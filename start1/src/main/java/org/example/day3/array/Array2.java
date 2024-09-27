package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 가족 정보를 배열에 저장하고 출력
        // 이름. 나이. 키. 성별. 아침밥 여부
        String[] names = {"홍길동", "김길동", "박길동", "정길동", "이길동"};

        /* C타입 for: 값 출력 외에 값 변경도 가능
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        */

        // for-each: 값 출력 외에 변경작업은 불가능
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(names));     // 배열의 모든 내용을 문자열 형태로 출력

        int[] ages = {50, 40, 30, 20, 10};

        /*
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        */

        for (int age: ages) {
            System.out.println(age);
        }
        System.out.println(Arrays.toString(ages));

        double[] heights = {180.5, 175.5, 170.5, 165.5, 155.5};

        /*
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }
        */

        for (double height : heights) {
            System.out.println(height);
        }
        System.out.println(Arrays.toString(heights));

        char[] genders = {'M', 'F', 'M', 'F', 'M'};

        /*
        for (int i = 0; i < genders.length; i++) {
            System.out.println(genders[i]);
        }
        */

        for (char gender : genders) {
            System.out.println(gender);
        }
        System.out.println(Arrays.toString(genders));

        boolean[] eats = {true, false, true, false, false};

        /*
        for (int i = 0; i < eats.length; i++) {
            System.out.println(eats[i]);
        }
        */

        for (boolean eat : eats) {
            System.out.println(eat);
        }
        System.out.println(Arrays.toString(eats));

        // error (배열의 인덱스 범위 초과)
        // System.out.println(names[5]);

        // 마지막 인덱스 출력
        System.out.println(names[names.length - 1]);
    }
}
