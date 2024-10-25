package org.example.day19.quiz.q2;

import java.util.Arrays;
import java.util.List;

public class AirConditioner implements Observer{
    List<String> managers = Arrays.asList("alice", "hong", "park");

    @Override
    public void update(int temp) {
        System.out.println(temp + "도가 변경되었습니다.");
    }

    public void setTemp(int temp) {
        for (String s: managers) {
            System.out.print(s + "님 ");
            update(temp);
        }
    }
}
