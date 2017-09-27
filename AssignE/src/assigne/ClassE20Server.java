/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
public class ClassE20Server extends Thread {

    private final Executor theExecutor = Executors.newCachedThreadPool();

    public void go() {
        try {
            ServerSocket aListeningSocket = new ServerSocket(9393);
            while (true) {
                System.out.println("Waiting for client connection request.");
                final Socket clientSocket = aListeningSocket.accept();
                this.theExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                            System.out.println("Waiting for a message from the client.");
                            String aRequest = in.readLine();
                            String bRequest = in.readLine();

                            Integer aNum = Integer.parseInt(aRequest);
                            Integer bNum = Integer.parseInt(bRequest);
                            Integer add = aNum + bNum;
                            Integer subtract = aNum - bNum;
                            Integer multiply = aNum * bNum;
                            Integer divide = aNum / bNum;
                            String result = aNum + " + " + bNum + " = " + add
                                    + ", " + aNum + " - " + bNum + " = " + subtract
                                    + ", " + aNum + " * " + bNum + " = " + multiply
                                    + ", " + aNum + " / " + bNum + " = " + divide;

                            System.out.println("Just got:" + aNum + " and " + bNum + " from client");
                            out.println(result);
                        } catch (IOException e) {
                        }
                    }
                });
            }
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
