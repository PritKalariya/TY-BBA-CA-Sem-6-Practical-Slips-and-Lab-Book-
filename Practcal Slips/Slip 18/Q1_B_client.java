// write a java program for simple standalone chatting application.

import java.io.*;
import java.net.*;

public class Q1_B_client {
    public static void main(String[] args) throws IOException {

        InetAddress remote = null;

        try {
            remote = InetAddress.getByName(null);
            Socket cs = new Socket(remote, 7060);
            System.out.println("Connected..." + cs);

            BufferedReader fromServer = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter toServer= new PrintWriter(new BufferedWriter(new OutputStreamWriter(cs.getOutputStream())), true);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String request, response;

            while(true) {
                response = keyboard.readLine();
                toServer.println(response);
                if(response.equals("END")) {
                    break;
                }
                request = fromServer.readLine();
                if(request.equals("END")) {
                    break;
                }
                System.out.print("Server: " + request);
            }
        } catch(UnknownHostException i3) {
            System.out.println("Unknown Host");
        }
    }
}