package org.example.day22.solve;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OnceCharacter {
    public static void main(String[] args) {
        String s = "abcabcdee";

        HashSet<String> set = new HashSet<>();
        String[] s2 = s.split("");
        for (String x: s2) {
            set.add(x);
        }
        System.out.println(set);
        List<String> list = Arrays.asList(s2);

        for (String x: list) {
            System.out.println(x);
        }
        System.out.println(list);
    }
}
