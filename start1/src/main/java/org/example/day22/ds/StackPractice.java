package org.example.day22.ds;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (true) {
            if (t == 0) {
                break;
            }
            String str = sc.nextLine();
            String[] s = str.split(" ");
            if (s.length == 2) {
                stack.push(Integer.parseInt(s[1]));
            }
            else {
                if (s[0].equals("top")) {
                    System.out.println(stack.peek());
                }
                else if (s[0].equals("size")) {
                    System.out.println(stack.size());
                }
                else if (s[0].equals("pop")) {
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.pop());
                    }
                }
                else if (s[0].equals("empty")) {
                    if (!stack.isEmpty()) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                }
            }
            t--;
        }
        sc.close();
    }
}
