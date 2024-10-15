package org.example.day11.quiz;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[3];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("은행 계좌 관리 애플리케이션");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록 보기");
            System.out.println("3. 계좌 정보 검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            System.out.println();

            if (choice == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("새 계좌 정보를 입력하세요. (형식: 계좌번호 소유자 잔액)");
                    sc.nextLine();
                    String info = sc.nextLine();
                    String[] s = info.split(" ");
                    int accountNum = Integer.parseInt(s[0]);
                    int balance = Integer.parseInt(s[2]);
                    accounts[count] = new Account(accountNum, s[1], balance);
                    count++;
                    break;
                case 2:
                    System.out.println("저장된 모든 계좌 정보를 출력합니다.");
                    for (int i = 0; i < count; i++) {
                        accounts[i].printInfo();
                    }
                    break;
                case 3:
                    System.out.print("검색할 계좌번호를 입력하세요: ");
                    int num = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].accountNum == num) {
                            accounts[i].printInfo();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("삭제할 계좌번호를 입력하세요: ");
                    int num1 = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].accountNum == num1) {
                            System.out.println("계좌가 삭제되었습니다.");
                            accounts[i] = null;
                            for (int j = i+1; j < count; j++) {
                                accounts[j-1] = accounts[j];
                            }
                            count--;
                            break;
                        }
                    }
                    break;
            }
        }
        sc.close();
    }
}
