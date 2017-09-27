/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignf;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
public class ClassF24ClientRunnable implements Runnable {

    private HashMap message;

    ClassF24ClientRunnable(HashMap message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {

            URL address = new URL("http://localhost:8084/AssignF/AssignF");
            HttpURLConnection connection = (HttpURLConnection) address.openConnection();
            connection.setDoOutput(true);

            System.out.print("Opening stream to server...");
            JSONOutputStream outToServer = new JSONOutputStream(connection.getOutputStream());
            System.out.println("success!");

            outToServer.writeObject(message);
            System.out.println("sent message...maybe");
            System.out.println("reading");
            JSONInputStream fromServer = new JSONInputStream(connection.getInputStream());
            HashMap response = (HashMap) fromServer.readObject();
            //     HashMap response = new HashMap ((HashMap) fromServer.readObject());
            System.out.println("Got message back: " + response);
            System.exit(1);
        } catch (JSONException | IOException | ParseException e) {
            System.out.println(e);
        }
    }
}
