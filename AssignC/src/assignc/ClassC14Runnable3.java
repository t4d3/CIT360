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
class ClassC14Runnable3 implements Runnable {

    private ArrayList<Integer> numbers;

    ClassC14Runnable3(ArrayList<Integer> merchandise) {
        this.numbers = merchandise;
    }

    @Override
    public void run() {
        /*
        Iterator<Integer> iMerchandise = numbers.iterator();
        while (iMerchandise.hasNext()) {
            if ((iMerchandise.next() % (Integer) 2) == 1) {
                iMerchandise.remove();
            }
        }
         */

        for (int i = 1; i < this.numbers.size(); i++) {
            if ((i % 2) == 1) {
                this.numbers.remove(i);
            }
        }
        System.out.println("Items removed!");
        System.out.println("Items Remaining: " + numbers);

    }
}
