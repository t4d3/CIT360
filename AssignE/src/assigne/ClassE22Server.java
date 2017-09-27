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
public class ClassE22Server {// implements Runnable {

    private final Executor theExecutor = Executors.newCachedThreadPool();
    private ServerSocket aListeningSocket;
    private Socket clientSocket;

    public ClassE22Server() {

    }

    void go() {
        Executor anExecutor = Executors.newFixedThreadPool(3);

        try {
            aListeningSocket = new ServerSocket(9394);
            System.out.println("Server has started!");
        } catch (IOException e) {
            System.out.println(e);
        }
        while (true) {
            try {
                clientSocket = aListeningSocket.accept();

                anExecutor.execute(new ClassE22ServerRunnable(clientSocket));

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
    /*
    @Override
    public void run() {
        try {

            JSONInputStream fromClient = new JSONInputStream(clientSocket.getInputStream());
            JSONOutputStream toClient = new JSONOutputStream(clientSocket.getOutputStream());

            ClassE22Password password = new ClassE22Password((HashMap) fromClient.readObject());
            System.out.println(password);
        } catch (IOException | JSONException | ParseException ex) {
            System.out.println(ex);
        }
    }
     */
}
