package org.example.day9.문자파일;

import java.io.*;

public class 바이트를문자스트림으로 {
    public static void main(String[] args) {
        // 글자를 써서, 파일에 저장
        // FileWriter
        // 글자를 써서, 네트워크로 전송
        // 네트워크 전송은 1바이트 단위로 전송
        // 글자를 써서 바이트배열로 변환 후 바이트배열을 바이트스트림으로 저장
        // 파일에 쓰기 (String --> byte)
        try {
            OutputStream os = new FileOutputStream("/Users/user/data/data.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write("안녕!!!");
            writer.flush();
            writer.close();
            os.close();
        }
        catch (Exception e) {
            e.printStackTrace();    // 자세히 에러정보 출력
        }

        // 파일 읽어오기 (byte 단위로 전송)
        // surround-with 코드 완성 (command+option+t)
        try {
            InputStream is = new FileInputStream("/Users/user/data/data.txt");
            Reader reader = new InputStreamReader(is, "UTF-8");
            char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data, 0, num);
            System.out.println(str);
            reader.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
