// Write a java program to display IPAddress and name of client machine.

import java.net.*;

public class Q1_A {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("Host Address: " + ip.getHostAddress());
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}