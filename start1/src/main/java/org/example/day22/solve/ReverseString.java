package org.example.day22.solve;

public class ReverseString {
    public static void main(String[] args) {
        String myString = "bread";
        // 뒤집어서 스트링으로 모으기
        // StringBuilder
        // String에서 뒤에서 가지고 와서 sb에 쌓기만 함
        int last = myString.length();
        StringBuilder sb = new StringBuilder();
        for (int i = last; i >= 0; i--) {
            sb.append(myString.charAt(i));
        } // for
        System.out.println(sb.toString());
    }
}
