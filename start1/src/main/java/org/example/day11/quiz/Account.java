package org.example.day11.quiz;

public class Account {
    int accountNum;
    String owner;
    int balance;

    public Account(int accountNum, String owner, int balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println("계좌번호: " + this.accountNum + ", 소유자: "
                + this.owner + ", 잔액: " + this.balance);
    }
}
