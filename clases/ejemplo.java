package clases;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

public class ejemplo {
    public static void main(String[] args) {
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(1000);
        byte[] buf = "Hola".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 4445);

        try {
            socket.send(packet);
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
        }
    }
}