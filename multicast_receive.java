import java.io.*;
import java.net.*;


public class multicast_receive {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket(8888);
            InetAddress group = InetAddress.getByName("239.1.1.1");
            socket.joinGroup(group);
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
