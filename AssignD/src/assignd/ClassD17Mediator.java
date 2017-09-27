/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignd;

import java.util.HashMap;

/**
 *
 * @author T4d3
 */
public class ClassD17Mediator {

    boolean shouldListen = false;
    HashMap<String, ClassD17Runnable> threads;

    ClassD17Mediator(HashMap<String, ClassD17Runnable> threads) {
        this.threads = threads;
    }

    synchronized void fromRunnable(String whoTo, String message) {
        if (threads.containsKey(whoTo)) {
            System.out.println("Going to: " + whoTo);
            threads.get(whoTo).send(message);
        } else {
            System.out.println("ERROR: Thread index doesn't exist!");
        }
    }
}
