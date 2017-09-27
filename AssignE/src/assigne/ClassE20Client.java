package assigne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T4d3
 */
public class ClassE20Client {

    public static void main(String[] args) {
        ClassE20Client.go();
    }

    public static void go() {
        try {
            Socket toServer = new Socket("127.0.0.1", 9393);

            PrintWriter out = new PrintWriter(toServer.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(toServer.getInputStream()));
            out.println(10);
            out.println(5);
            System.out.println("Sent 10 and 5, waiting for response...");
            String response = in.readLine();
                       System.out.println("Response:\n" + response);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
