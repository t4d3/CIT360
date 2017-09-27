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
public class ClassC12Runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            try {
                System.out.print(i + "! ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
