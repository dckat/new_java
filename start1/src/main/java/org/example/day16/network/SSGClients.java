package org.example.day16.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SSGClients {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 1000; i++) {
            Socket client = new Socket("localhost", 3000);
            System.out.println(i + ">> 클라이언트가 접속함");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String data = buffer.readLine();
            System.out.println("서버로부터 받은 데이터>> " + data);
        }
    }
}
