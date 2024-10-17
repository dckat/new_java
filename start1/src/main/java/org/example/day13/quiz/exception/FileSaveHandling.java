package org.example.day13.quiz.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSaveHandling {
    public static void main(String[] args) {
        FileWriter file = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("파일명입력>> ");
            String name = sc.nextLine();
            file = new FileWriter("/Users/user/data/" + name);
            System.out.print("파일내용입력>> ");
            String content = sc.nextLine();
            file.write(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            sc.close();
        }
    }
}
