/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author T4d3
 */
class ClassC15Runnable3 implements Runnable {

    private ArrayList<Integer> numbers;

    ClassC15Runnable3(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public synchronized void run() {
        Iterator<Integer> iMerchandise = numbers.iterator();
        while (iMerchandise.hasNext()) {
            if ((iMerchandise.next() % (Integer) 2) == 1) {
                iMerchandise.remove();
            }

            /*            for (int i = 1; i < this.numbers.size(); i++) {
                if ((i % 2) == 1) {
                    this.numbers.remove(i);
                    i--;
                }
            }*/
            System.out.println("Items removed!");
            System.out.println("Items Remaining: " + numbers);

        }
    }
}
