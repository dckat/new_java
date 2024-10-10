package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class 파일에저장 {
    public static void main(String[] args) {
        // 날짜, 제목, 내용을 입력해서 날짜별 파일에 저장
        // 파일은 /Users/user/data/날짜.txt에 저장
        Date date = new Date();
        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        int day = date.getDate();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();
        String ymd = year + "" + month + "" + day;
        String hms =  hour + "" + minute + "" + second;
        String s1 = ymd+hms;
        /*
        String s2 = JOptionPane.showInputDialog("제목 입력");
        String s3 = JOptionPane.showInputDialog("내용 입력");
        */

        String s = JOptionPane.showInputDialog("제목-내용 순서대로 입력");
        System.out.println(s);  // [제목]-[내용] 형식
        String[] total = s.split("-");
        String s2 = total[0];
        String s3 = total[1];

        // 파일 생성하고 s1, s2, s3를 저장
        try {
            FileWriter f = new FileWriter("/Users/user/data/" + s1 + ".txt");
            f.write(s1 + "\n");
            // f.write(s2 + "\n");
            // f.write(s3 + "\n");

            for (String x: total) {
                f.write(x + "\n");
            }
            f.close();  // 통로(자바-외부파일/네트워크 연결), 연결(connection), stream
        } catch (IOException e) {
            System.out.println("파일 다룰때 에러가 발생함.");
            e.printStackTrace();                // 에러 정보 구체적으로 출력
            System.out.println(e.getMessage()); // 에러 정보 간단한 문자열로 출력
        }
    }
}
