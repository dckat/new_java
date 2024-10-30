package org.example.day22.solve;

public class RemoveString {
    public static void main(String[] args) {
        String myString = "abcdef";
        String letter = "f";
        // myString에 있는것 하나씩 빼서 f가 아니면 모으기
        // String을 모을때는 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        // 1. char 배열로
        // 2. charAt (인덱스)
        for (int i = 0; i < myString.length(); i++) {
            // System.out.println(myString.charAt(i));
            if (myString.charAt(i) != letter.charAt(i)) {
                sb.append(myString.charAt(i));
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
