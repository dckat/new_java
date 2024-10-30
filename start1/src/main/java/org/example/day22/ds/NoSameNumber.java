package org.example.day22.ds;

import java.util.Arrays;
import java.util.Stack;

public class NoSameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int x : arr) {
            if (x != stack.peek()) {
                stack.push(x);
            }
        }
        // System.out.println(stack);
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
