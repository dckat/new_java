package org.example.day22.quiz;

public class Q9 {
    public static void main(String[] args) {
        String sno = "2056521";

        char[] arr = sno.toCharArray();
        if (arr[arr.length - 1] == '1') {
            System.out.println("서대문구에서 출생");
        }
        else {
            System.out.println("다른 구에서 출생");
        }
        if (sno.contains("52")) {
            int index = sno.indexOf("52");
            String sub = sno.substring(index, index+2);
            char[] arr2 = sub.toCharArray();

            int sum = 0;
            for (int i = 0; i < arr2.length; i++) {
                sum += (arr2[i] - '0');
            }

            if (sum <= 10) {
                System.out.println("유효한 주민번호입니다.");
            }
            else {
                System.out.println("유효하지 않은 주민번호입니다.");
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '5') {
                count++;
            }
        }
        System.out.println("5의 갯수: " + count);
    }
}
