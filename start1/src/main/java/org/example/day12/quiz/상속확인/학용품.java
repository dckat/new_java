package org.example.day12.quiz.상속확인;

public class 학용품 {
    int price;
    String company;

    public 학용품(int price, String company) {
        this.price = price;
        this.company = company;
    }

    public void buy() {
        System.out.println("산다.");
    }
}
