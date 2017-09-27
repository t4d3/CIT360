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
public class ClassE23ClientRunnable implements Runnable {

    private ClassE22Password oldPassword;
    private ClassE22Password newPassword;

    ClassE23ClientRunnable(ClassE22Password password) {
        this.oldPassword = password;
    }

    @Override
    public void run() {
        try {
            Socket server = new Socket("localhost", 9394);
            JSONInputStream fromServer = new JSONInputStream(server.getInputStream());
            JSONOutputStream toServer = new JSONOutputStream(server.getOutputStream());

            toServer.writeObject(oldPassword);

            newPassword = new ClassE22Password((HashMap) fromServer.readObject());

        } catch (JSONException | IOException | ParseException e) {
            System.out.println(e);
        }
    }

    public ClassE22Password getOldPassword() {
        return oldPassword;
    }

    public ClassE22Password getNewPassword() {
        return newPassword;
    }
}
