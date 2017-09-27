/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignf25;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
public class ClassF25ClientRunnable implements Runnable {

    private ClassF25Car newCar;

    ClassF25ClientRunnable(ClassF25Car newCar) {
        this.newCar = newCar;
    }

    @Override
    public void run() {
        try {

            URL address = new URL("http://localhost:8080/AssignF25/ServletF25");
            HttpURLConnection connection = (HttpURLConnection) address.openConnection();
            connection.setDoOutput(true);

            System.out.print("Opening stream to server...");
            JSONOutputStream outToServer = new JSONOutputStream(connection.getOutputStream());
            System.out.println("success!");
            outToServer.writeObject(newCar);
            System.out.println("sent message...maybe...Reading");

            JSONInputStream fromServer = new JSONInputStream(connection.getInputStream());
            System.out.print("Receiving connection made...");
            HashMap carMap = (HashMap) fromServer.readObject();
            System.out.println("Got message back: " + carMap);
            System.out.print("Converting carMap to pricedCar...");            
            ClassF25Car pricedCar = new ClassF25Car(carMap);
            System.out.println("DONE");            
            
        } catch (JSONException | IOException | ParseException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
