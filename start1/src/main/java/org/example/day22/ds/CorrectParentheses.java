package org.example.day22.ds;

import java.util.Stack;

public class CorrectParentheses {
    public static void main(String[] args) {
        String s = "(())()";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')') {
                try{
                    st.pop();
                }
                catch(Exception e){
                    System.out.println(false);
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}
