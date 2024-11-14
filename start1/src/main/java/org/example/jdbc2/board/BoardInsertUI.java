package org.example.jdbc2.board;

import java.util.Scanner;

public class BoardInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no 입력>> ");
        String noValue = sc.nextLine();
        System.out.print("title 입력>> ");
        String titleValue = sc.nextLine();
        System.out.print("content 입력>> ");
        String contentValue = sc.nextLine();
        System.out.print("writer 입력>> ");
        String writerValue = sc.nextLine();
        sc.close();

        BoardDAO dao = new BoardDAO();
        dao.insert(noValue, titleValue, contentValue, writerValue);
    }
}
