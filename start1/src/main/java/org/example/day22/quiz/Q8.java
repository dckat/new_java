package org.example.day22.quiz;

import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < s5.length; i++) {
            s.push(s5[i]);
        }
        int sum = s.get(0) + s.get(3) + s.get(5);
        System.out.println(sum);

        for (int i = 0; i < 3; i++) {
            s.pop();
        }
        System.out.println(s);
    }
}
