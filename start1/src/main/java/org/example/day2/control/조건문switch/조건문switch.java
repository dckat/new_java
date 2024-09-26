package org.example.day2.control.조건문switch;

public class 조건문switch {
    public static void main(String[] args) {
        int day = 5;    // 목
        // 주말인지 판단 (switch)
        switch (day) {      // 실수.long 불가, char.String 가능
            case 1: case 7:
                System.out.println("주말");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("평일");
                break;
        }
    }
}
