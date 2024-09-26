package org.example.day2.control.quiz;

import java.util.Scanner;

public class Q4_basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("여행 지역을 입력하세요: ");
        String region = scanner.next();
        System.out.print("1인당 경비를 입력하세요: ");
        double price = scanner.nextDouble();
        System.out.print("여행 인원을 입력하세요: ");
        int numPeople = scanner.nextInt();
        System.out.print("할인율(%)을 입력하세요: ");
        double discountRate = scanner.nextDouble();
        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean vip = scanner.nextBoolean();
        System.out.print("당부의 말을 입력하세요: ");
        scanner.nextLine();
        String comment = scanner.nextLine();

        double totalPrice = price * numPeople;
        double totalDiscount = discountRate;
        if (vip == true) {
            totalDiscount += 5;
        }
        double discountPrice = totalPrice * totalDiscount / 100;
        double priceAfterDiscount = totalPrice - discountPrice;

        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + region);
        System.out.println("1인당 경비: " + price + "원");
        System.out.println("여행 인원: " + numPeople + "명");
        System.out.println("기본 할인율: " + discountRate + "%");
        System.out.println("VIP 추가 할인율: " + (vip ? 5 : 0) + "%");
        System.out.println("최종 할인율: " + totalDiscount + "%");
        System.out.println("총 경비: " + totalPrice + "원");
        System.out.println("할인 금액: " + discountPrice + "원");
        System.out.println("할인 후 총 경비: " + priceAfterDiscount + "원");
        System.out.println("당부의 말: " + comment);

        scanner.close();
    }
}
