package org.example.day19.quiz.q1;

public class DatabaseConnection {
    private static DatabaseConnection connection;

    private DatabaseConnection() {
        System.out.println("데이터베이스 연결 객체가 생성되었습니다.");
    }

    public static DatabaseConnection getInstance() {
        if (connection == null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }

    public String toString() {
        return connection.hashCode() + "";
    }
}
