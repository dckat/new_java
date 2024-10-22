package org.example.day16.network;

import java.io.IOException;
import java.net.ServerSocket;

public class SSGServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3000);
        // ip는 컴퓨터 따라감.
        while (true) {
            System.out.println("서버가 돌아가는 중");
            server.accept();
            System.out.println("승인이 떨어짐.");
        }
    }
}
