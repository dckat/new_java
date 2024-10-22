package org.example.day16.quiz.q3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(56514);
        System.out.println("받는 쪽 소켓 시작");

        byte[] data = new byte[256];

        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("받을 준비 끝");
        socket.receive(packet);

        System.out.println("받은 데이터: " + new String(data));
        socket.close();
    }
}
