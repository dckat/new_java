package org.example.distribute.quiz.select;

import org.bson.Document;
import org.example.distribute.quiz.AwsDistributeDAO;
import org.example.distribute.quiz.vo.LogVO;
import org.example.distribute.quiz.vo.UserVO;

import java.util.ArrayList;
import java.util.Scanner;

public class AwsDistributeSelect {
    public static void main(String[] args) {
        try {
            AwsDistributeDAO dao = new AwsDistributeDAO();
            Scanner scanner = new Scanner(System.in);
            System.out.print("id>> ");
            int id = scanner.nextInt();
            UserVO bag = dao.one(id);

            if (bag != null) {
                System.out.println("User Info");
                System.out.println("ID: " + bag.getId());
                System.out.println("Name: " + bag.getName());
                System.out.println("Email: " + bag.getEmail());
                System.out.println("Signup Date: " + bag.getSignupDate());
            }
            else {
                System.out.println("아이디가 일치하는 사용자를 찾을수 없음");
            }

            ArrayList<LogVO> result = dao.findLogList(id);
            if (result.size() != 0) {
                System.out.println("Activity Logs");
                for (LogVO log : result) {
                    System.out.println("user_id: " + log.getUserId());
                    System.out.println("activity: " + log.getActivity());
                    System.out.println("timestamp: " + log.getTimestamp());
                }
            }
            else {
                System.out.println("로그 기록이 존재하지 않음.");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
