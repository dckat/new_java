package org.example.day22.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                list.add(Integer.parseInt((my_string.charAt(i) - '0')+ ""));
            }
        }
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        sc.close();
    }
}
