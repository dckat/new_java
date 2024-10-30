package org.example.day22.quiz;

import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("밥")) {
                st.push(s[i]);
            }
            else if (s[i].equals("커피")) {
                st.pop();
            }
        }
        System.out.println(st.empty());
    }
}
