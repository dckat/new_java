package org.example.day9.quiz.Q2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
            String input = sc.nextLine();
            String[] s = input.split(" ");

            books[i] = new Book();
            books[i].setTitle(s[0]);
            books[i].setAuthor(s[1]);
            books[i].setIsbn(s[2]);
        }

        System.out.println("------등록된 도서관 책 목록------");
        for (int i = 0; i < 2; i++) {
            books[i].displayInfo();
        }

        sc.close();
    }
}
