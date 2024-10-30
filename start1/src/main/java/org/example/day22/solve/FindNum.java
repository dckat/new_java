package org.example.day22.solve;

public class FindNum {
    public static void main(String[] args) {
        String s = "1234";
        char[] c = s.toCharArray();

        int result = 0;
        for (char one: c) {
            result += (one - '0');
        }
        System.out.println(result);
    }
}
