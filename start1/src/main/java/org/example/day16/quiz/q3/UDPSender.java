package org.example.day16.quiz.q3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("localhost");
        String str = "i am a android programmer!\n";
        byte[] data = str.getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 56514);

        System.out.println("클라이언트 포트>> " + packet.getPort());

        socket.send(packet);
        socket.close();
    }
}
