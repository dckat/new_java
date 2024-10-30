package org.example.day22.ds;

import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("정길동");
        System.out.println(stack);
        System.out.println(stack.get(0));
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.contains("홍길동"));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println("꺼낼것이 없음.");
        }

    }
}
