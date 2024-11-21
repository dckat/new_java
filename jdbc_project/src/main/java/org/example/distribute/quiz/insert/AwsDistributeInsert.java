package org.example.distribute.quiz.insert;

import org.example.distribute.quiz.AwsDistributeDAO;
import org.example.distribute.quiz.vo.UserVO;

import java.util.Scanner;

public class AwsDistributeInsert {
    // MySQL JDBC URL
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    public static void main(String[] args) {
        try {
            AwsDistributeDAO dao = new AwsDistributeDAO();
            Scanner sc = new Scanner(System.in);
            System.out.print("name>> ");
            String name = sc.next();
            System.out.print("email>> ");
            String email = sc.next();

            UserVO bag = new UserVO();
            bag.setName(name);
            bag.setEmail(email);
            dao.insert(bag);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
