package org.example.day2.control;

public class 조건문 {
    public static void main(String[] args) {
        int month = 9;

        // 1. 계절 판별
        if ((month == 12) || (month >= 1 && month < 3)) {
            System.out.println("겨울");
        } else if (month >= 3 && month < 6) {
            System.out.println("봄");
        } else if (month >= 6 && month < 9) {
            System.out.println("여름");
        } else if (month >= 9 && month < 12) {
            System.out.println("가을");
        }

        // 2. 먹고 싶은 음식에 따른 음식점 선택
        String food = "짬뽕";
        switch (food) {
            case "짬뽕":
                System.out.println("중국집");
                break;
            case "우동":
                System.out.println("분식집");
                break;
            case "감자탕":
                System.out.println("한식");
                break;
            default:
                System.out.println("집에서 먹자");
                break;
        }
    }
}
