/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigne;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
public class ClassE21Server implements Runnable {

    private final Executor theExecutor = Executors.newCachedThreadPool();

    public ClassE21Server() {
    }

    @Override
    public void run() {
        try {
            ServerSocket aListeningSocket = new ServerSocket(9394);
            System.out.println("Server has started!");
            while (true) {
                // I feel like there's a better way to do this       vvvvvvv
                final Socket clientSocket = aListeningSocket.accept();
                this.theExecutor.execute(new Runnable() {
                    @Override
                    // To this                                       ^^^^^^^
                    public void run() {
                        try {
                            JSONInputStream fromClient = new JSONInputStream(clientSocket.getInputStream());
                            JSONOutputStream toClient = new JSONOutputStream(clientSocket.getOutputStream());

                            ClassE21Game game = new ClassE21Game((HashMap) fromClient.readObject());
                            if (game.checkIntegrity()) {
                                System.out.println("Saving game data for " + game.getPlayerName() + "...");
                                game.setWasSaved(true);
                            }
                            toClient.writeObject(game);
                        } catch (ParseException | IOException | JSONException e) {
                            System.out.println(e);
                        }
                    }
                }
                );
            }
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
