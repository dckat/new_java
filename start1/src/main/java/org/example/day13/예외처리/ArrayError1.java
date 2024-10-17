package org.example.day13.예외처리;

public class ArrayError1 {
    public void array() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("배열 예외 처리함.");
        }
    }
}
