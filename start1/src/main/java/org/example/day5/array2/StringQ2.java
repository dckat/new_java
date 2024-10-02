package org.example.day5.array2;

public class StringQ2 {
    public static void main(String[] args) {
        String tel = "    011-245-1234";

        // 1. 공백 제거
        tel = tel.trim();
        System.out.println(tel);

        String[] tel2 = tel.split("-");

        // if
        if (tel2[0].equals("011")) {
            System.out.println("SK");
        }
        else if (tel2[0].equals("019")) {
            System.out.println("LG");
        }
        else {
            System.out.println("Apple");
        }

        // switch
        /*
        switch (tel2[0]) {
            case "011":
                System.out.println("LG");
                break;
            case "019":
                System.out.println("LG");
                break;
            default:
                System.out.println("Apple");
        }
        */

        if (tel2[1].length() >= 4) {
            System.out.println("최신폰");
        }
        else {
            System.out.println("올드폰");
        }

        int sum = 0;
        for (int i = 0; i < tel2.length; i++) {
            sum += tel2[i].length();
        }
        if (sum >= 10) {
            System.out.println("유효한 전화번호");
        }
        else {
            System.out.println("유효하지 않은 전화번호");
        }
    }
}
