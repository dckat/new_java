package org.example.day15.quiz.q6;

public class Main {
    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];  // 첫 번째 값을 초기 최소값으로 설정
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> int findDuplicate(T[] array) {
        int duplicates = 0;     // 중복된 값의 갯수 (최대로 중복된 것만)

        // 2중 for문 활용 각 element별 중복 갯수 확인
        for (int i = 0; i < array.length; i++) {
            int temp = 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] == array[j]) {
                    temp++;
                }
            }
            if (temp > duplicates) {
                duplicates = temp;
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 9};
        System.out.println("정수 배열의 최솟값: " + findMin(intArray));

        String[] stringArray = {"apple", "banana", "orange"};
        System.out.println("문자열 배열의 최솟값: " + findMin(stringArray));

        Integer[] intArray2 = {1, 1, 3, 5, 7};
        System.out.println("정수 배열의 중복된 값 갯수: " + findDuplicate(intArray2));

        String[] stringArray2 = {"apple", "apple", "orange"};
        System.out.println("문자열 배열의 중복된 값 갯수: " + findDuplicate(stringArray2));
    }
}
