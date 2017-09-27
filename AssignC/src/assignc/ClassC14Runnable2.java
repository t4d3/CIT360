/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignc;

import java.util.ArrayList;

/**
 *
 * @author T4d3
 */
class ClassC14Runnable2 implements Runnable {

    private ArrayList<Integer> numbers;

    ClassC14Runnable2(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            this.numbers.add(i);
        }
        System.out.println("Added Items: " + numbers);
    }
}
