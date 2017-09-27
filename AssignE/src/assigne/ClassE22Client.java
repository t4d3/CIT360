package assigne;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T4d3
 */
public class ClassE22Client {

    public static void main(String[] args) {
        System.out.println("Starting client");
        ClassE22Password password = new ClassE22Password("Password123", "Order66");
        System.out.println("created password");
        ClassE22Client.go(password);
    }

    private static ClassE22Client go(ClassE22Password password) {
        try {
            Socket server = new Socket("localhost", 9394);
            JSONInputStream fromServer = new JSONInputStream(server.getInputStream());
            JSONOutputStream toServer = new JSONOutputStream(server.getOutputStream());

            toServer.writeObject(password);
            System.out.println("Sent:\t  " + password);

            password = new ClassE22Password((HashMap) fromServer.readObject());

            System.out.println("Received: " + password);
        } catch (JSONException | IOException | ParseException e) {
            System.out.println(e);
        }
        return null;
    }
}
