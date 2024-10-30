package org.example.day22.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToCollection {
    public static void main(String[] args) {
        String[] s3 = {"박명수", "유재석", "김종국", "송지효", "하하"};
        // List<String> list = Arrays.asList(s3);
        // 길이 조절 불가능 (remove, add X)

        // 길이 조절 가능한 ArrayList (remove. add 사용가능)
        List<String> list2 = new ArrayList<>(Arrays.asList(s3));
        Collections.sort(list2);
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).length() < 3) {
                list2.remove(i);
            }
        }
        System.out.println(list2);
        list2.set(0, "유재돌");
        System.out.println(list2);

        list2.add("김종민");
        System.out.println(list2);
    }
}
