/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigne;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
public class ClassE23ServerRunnable implements Runnable {

    private final Socket clientSocket;

    public ClassE23ServerRunnable(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        System.out.println("\tFORKED:  " + clientSocket);
        try {

            JSONInputStream fromClient = new JSONInputStream(clientSocket.getInputStream());
            JSONOutputStream toClient = new JSONOutputStream(clientSocket.getOutputStream());

            ClassE22Password password = new ClassE22Password((HashMap) fromClient.readObject());
            System.out.println("Received:\t" + password);

            password.hashPassword();
            System.out.println("New password:\t" + password);
            toClient.writeObject(password);
        } catch (IOException | JSONException | ParseException ex) {
            System.out.println(ex);
        }
        System.out.println("\tFORK END");
    }
}
