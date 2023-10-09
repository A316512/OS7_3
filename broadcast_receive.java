import java.io.*;
import java.net.*;

public class broadcast_receive {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(8888);
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + message);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
