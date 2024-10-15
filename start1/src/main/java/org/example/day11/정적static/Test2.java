package org.example.day11.정적static;

import java.text.DecimalFormat;

public class Test2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(123.1));
        System.out.println(df.format(123.12));
        System.out.println(df.format(123));
        System.out.println(df.format(0.5));
        System.out.println(df.format(0.123));
    }
}
