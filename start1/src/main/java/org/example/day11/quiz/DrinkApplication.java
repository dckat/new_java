package org.example.day11.quiz;

import java.util.Scanner;

public class DrinkApplication {
    private static Drink[] drinks = {
            new Drink("콜라", 1200, 10),
            new Drink("사이다", 1100, 10),
            new Drink("커피", 900, 10)
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("자판기 메뉴");
            System.out.println("1. 음료 보기");
            System.out.println("2. 음료 구매");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("자판기를 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    for (int i = 0; i < drinks.length; i++) {
                        System.out.println(drinks[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < drinks.length; i++) {
                        System.out.println(drinks[i]);
                    }
                    System.out.print("구매할 음료 번호를 선택하세요: ");
                    int num = sc.nextInt();

                    if (drinks[num-1].getCount() > 0) {
                        System.out.println(drinks[num-1].getName() + "를 구매했습니다.");
                        drinks[num-1].setCount(drinks[num-1].getCount()-1);
                    }
                    else {
                        System.out.println(drinks[num-1].getName() + "의 재고가 없습니다.");
                    }
                    break;
            }
        }
        sc.close();
    }
}
