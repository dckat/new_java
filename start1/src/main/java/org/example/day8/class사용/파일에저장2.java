package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장2 {
    public static void main(String[] args) {
        // 주말동안 할 일 입력받아 저장
        // 할 일이 "운동"이면 파일명은 "운동.txt"
        // 저장 위치는 /Users/user/data/운동.txt(절대경로)로 생성
        // 입력은 2회 받음. (1. 주말동안 할 일은? [ex: 운동.코딩.여행 등] 2. 구체적인 내용 입력 [형식: 장소-시간-내용])
        // 파일은 3개 이상 만들어지도록 처리
        String work = JOptionPane.showInputDialog("주말동안 할 일은?");
        String contents = JOptionPane.showInputDialog("구체적인 내용 입력");
        String[] total = contents.split("-");

        try {
            FileWriter f = new FileWriter("/Users/user/data/" + work + ".txt");
            for (String content : total) {
                f.write(content + "\n");
            }
            f.close();
        }
        catch (IOException e) {
            System.out.println("파일 다룰때 에러가 발생함.");
            e.printStackTrace();                // 에러 정보 구체적으로 출력
            System.out.println(e.getMessage()); // 에러 정보 간단한 문자열로 출력
        }
    }
}
