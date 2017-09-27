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
public class ClassE21Client {

    public static void main(String[] args) {
        ClassE21Game game = new ClassE21Game(2, "Craig", 15);
        game = ClassE21Client.go(game);
        System.out.println(game.getWasSaved() ? "Game was saved!!" : "Game was not saved!");
    }

    private static ClassE21Game go(ClassE21Game game) {
        try {
            Socket server = new Socket("localhost", 9394);
            JSONInputStream fromServer = new JSONInputStream(server.getInputStream());
            JSONOutputStream toServer = new JSONOutputStream(server.getOutputStream());

            toServer.writeObject(game);

            return new ClassE21Game((HashMap) fromServer.readObject());

        } catch (ParseException | JSONException | IOException e) {
            System.out.println(e);
        }
        return null;
    }
}
