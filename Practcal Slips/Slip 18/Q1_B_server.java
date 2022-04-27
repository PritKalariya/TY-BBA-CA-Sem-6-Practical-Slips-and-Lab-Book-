// write a java program for simple standalone chatting application.

import java.io.*;
import java.net.*;

public class Q1_B_server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7060);
            System.out.println("Server started waiting..." +ss);
            try {
                Socket s = ss.accept();
                System.out.println("Connected..." + s);

                try {
                    BufferedReader fromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    PrintWriter toClient = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())), true);
                    // DataOutputStream toClient = new DataOutputStream(s.getOutputStream());
                    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
                    String request, response;

                    while(true) {
                        request=fromClient.readLine();
                        if(request.equals("END")) {
                            break;
                        }
                        System.out.println("Client: " + request);
                        response = keyboard.readLine();
                        toClient.println(response);
                        if(response.equals("END")) {
                            break;
                        }
                    }

                } catch(IOException i1) {
                    System.out.println(i1);
                }

            } catch(IOException i2) {
                System.out.println(i2);
            }
        } catch(IOException i3) {
            System.out.println(i3);
        }
    }
}