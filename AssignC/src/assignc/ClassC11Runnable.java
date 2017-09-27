/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignc;

/**
 *
 * @author T4d3
 */
public class ClassC11Runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 3; i > 0; i--) {
            try {
                Thread.sleep(1000);
                System.out.print(i + "...");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}