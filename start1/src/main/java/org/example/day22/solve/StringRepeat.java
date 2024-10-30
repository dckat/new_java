package org.example.day22.solve;

public class StringRepeat {
    public static void main(String[] args) {
        String n = "hello";
        int k = 3;
        // 1. n을 char로 분리시켜서 --> 1)배열. 2)charAt(index)
        // 2. k만큼 반복해서 - for
        // 3. 붙이기 - StringBuilder
        char[] c = n.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char one: c) {
            for (int i = 0; i < k; i++) {
                sb.append(one);
            }
        }
        System.out.println(sb.toString());
    }
}
