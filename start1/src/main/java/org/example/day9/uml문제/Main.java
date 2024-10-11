package org.example.day9.uml문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Burger";
        item1.price = 5.99;

        Item item2 = new Item();
        item2.name = "Fries";
        item2.price = 2.99;

        Item item3 = new Item();
        item3.name = "Soda";
        item3.price = 1.99;
        Item[] items = {item1, item2, item3};

        Scanner sc = new Scanner(System.in);
        Item[] orders = new Item[3];    // 주문한 음식 저장
        int count = 0;

        while (true) {
            System.out.println("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 x 입력");
            System.out.println("=======================");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i+1) + ">> " + items[i].getName() + ":  $" + items[i].getPrice());
            }
            System.out.print("입력>> ");
            String input = sc.next();
            if (input.equals("x")) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println();
                System.out.println("Your order:");
                for (Item order : orders) {
                    System.out.println(order.getName() + ": " + order.getPrice());
                }
                break;
            }
            else {
                if (count < 3) {
                    System.out.println("주문 가능한 메뉴입니다.");
                    int input2 = Integer.parseInt(input);
                    if (input2 >= 1 && input2 <= 3) {
                        orders[count] = items[input2-1];
                        count++;
                    }
                    else {
                        System.out.println("잘못된 값 입력!!!!");
                    }
                }
                else {
                    System.out.println("주문이 불가능합니다!!!");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
