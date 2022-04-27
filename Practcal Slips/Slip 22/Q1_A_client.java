//  Write a java program to display Date and Time of Server machine on client machine.

import java.io.*;
import java.net.*;

public class Q1_A_client {
    public static void main(String[] args) throws Exception {
        try {
            Socket soc = new Socket(InetAddress.getLocalHost(),7080);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}