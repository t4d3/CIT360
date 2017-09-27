/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignf25;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
public class ClassF25Client {

    public static void main(String[] args) {

        System.out.println("Starting client");
        Executor anExecutor = Executors.newFixedThreadPool(3);

        ClassF25Car newCar = new ClassF25Car("Ford", 2015, 4);
        System.out.println("newCar: " + newCar);
        ClassF25ClientRunnable clientConnection = new ClassF25ClientRunnable(newCar);
        anExecutor.execute(clientConnection);
 
    }
}
