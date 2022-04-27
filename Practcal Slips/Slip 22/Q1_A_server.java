//  Write a java program to display Date and Time of Server machine on client machine.

import java.net.*;
import java.io.*;
import java.util.*;

public class Q1_A_server {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(7080);

        while(true) {
            System.out.println("Waiting for connections.....");
            Socket soc = s.accept();
            System.out.println("Client connected.");
            DataOutputStream out = new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server Date " + (new Date()).toString() + "\n");
            out.close();
            soc.close();
        }
    }
}
