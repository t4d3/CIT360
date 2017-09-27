/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigne;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
public class ClassE23Server {// implements Runnable {

    private ServerSocket aListeningSocket;
    private Socket clientSocket;

    public ClassE23Server() {
        try {
            aListeningSocket = new ServerSocket(9394);
            System.out.println("Server has started!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    void go() {
        Executor anExecutor = Executors.newFixedThreadPool(3);
        while (true) {
            try {
                clientSocket = aListeningSocket.accept();

                anExecutor.execute(new ClassE23ServerRunnable(clientSocket));

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
