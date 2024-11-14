package org.example.jdbc2.board;

import java.util.Scanner;

public class BoardUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 no 입력>> ");
        String noValue = sc.nextLine();
        System.out.print("바꿀 content 입력>> ");
        String contentValue = sc.nextLine();
        sc.close();

        BoardDAO dao = new BoardDAO();
        dao.update(noValue, contentValue);
    }
}
