package assigne;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T4d3
 */
public class ClassE23Client {

    public static void main(String[] args) {
        Executor anExecutor = Executors.newCachedThreadPool();
        System.out.println("Starting client");
        ClassE22Password password = new ClassE22Password("Password123", "Order66");
        ClassE23ClientRunnable clientConnection = new ClassE23ClientRunnable(password);
        anExecutor.execute(clientConnection);
        while (clientConnection.getNewPassword() == null) {
            System.out.print("Still null...");
        }
        System.out.println();
        System.out.println(clientConnection.getNewPassword());
    }
}
