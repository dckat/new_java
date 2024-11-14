package org.example.jdbc2.board;

import java.util.Scanner;

public class BoardDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 no 입력>> ");
        String noValue = sc.next();     // apple
        sc.close();

        BoardDAO dao = new BoardDAO();
        dao.delete(noValue);
    }
}
