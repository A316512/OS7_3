import java.io.*;
import java.net.*;

public class multicast_send {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] data = "Hello, Multicast!".getBytes();
            InetAddress group = InetAddress.getByName("239.1.1.1");
            DatagramPacket packet = new DatagramPacket(data, data.length, group, 8888);
            socket.send(packet);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

