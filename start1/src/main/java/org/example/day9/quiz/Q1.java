package org.example.day9.quiz;

import java.io.*;

public class Q1 {
    public static void main(String[] args) {
        String fileName1 = "/Users/user/data/공부.txt";
        String fileName2 = "/Users/user/data/공부2.txt";

        try {
            InputStream is = new FileInputStream(fileName1);
            OutputStream os = new FileOutputStream(fileName2);
            is.transferTo(os);
            is.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
