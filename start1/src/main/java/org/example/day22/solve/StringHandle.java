package org.example.day22.solve;

public class StringHandle {
    public static void main(String[] args) {
        String x = "a234";
        boolean result = true;

        int size = x.length();
        if (size == 4 || size == 6) {
            char[] c = x.toCharArray();
            for (char one: c) {
                if (one < '0' || one > '9') {   // 숫자가 아닌지 조건
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
