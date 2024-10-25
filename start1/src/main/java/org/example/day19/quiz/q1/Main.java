package org.example.day19.quiz.q1;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection3 = DatabaseConnection.getInstance();

        System.out.println("Connection 1 주소: " + connection1);
        System.out.println("Connection 2 주소: " + connection2);
        System.out.println("Connection 3 주소: " + connection3);
    }
}
