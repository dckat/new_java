package org.example.day20.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("숫자 입력>> ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(numbers));
    }
}
