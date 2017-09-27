/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignA;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 *
 * @author T4d3
 */
class ClassA4 {

    public ClassA4() {
        ArrayList listA4 = new ArrayList();
        for (int i = 0; i < 15; i++) {
            listA4.add(i);
        }
        System.out.println(listA4 + "\t\tOriginal list");
        removeSpecific(listA4);
        addNumberBeginning(listA4);
        addNumberEnd(listA4);
        replaceNumbers(listA4);
        addMiddle(listA4);
        removeMiddle(listA4);
    }

    private void removeSpecific(ArrayList<Integer> listA4) {
        if (listA4.contains(10)) {
            listA4.remove(Integer.valueOf(10));
        }
        System.out.println(listA4 + "\t\t\tRemoved 10");

    }

    private void addNumberBeginning(ArrayList<Integer> listA4) {
        listA4.add(0, -1);
        System.out.println(listA4 + "\t\tAdded -1 to beginning");
    }

    private void addNumberEnd(ArrayList<Integer> listA4) {
        listA4.add(listA4.size(), 15);
        System.out.println(listA4 + "\t\tAdded 15 to end");
    }

    private void replaceNumbers(ArrayList<Integer> listA4) {
        listA4.set(3, 33);
        listA4.set(5, 55);
        System.out.println(listA4 + "\tswitched 3rd # w/ 33, and 5th # w/ 55");
    }

    private void addMiddle(ArrayList<Integer> listA4) {
        int arrayLengh = listA4.size();
        int midWay = Math.round(arrayLengh / 2);
        listA4.set((listA4.size()/2), 3000);
        System.out.println(listA4 + "\tAdded 3000 to middle");
    }

    private void removeMiddle(ArrayList listA4) {
        listA4.remove(listA4.size()/2);
        System.out.println(listA4 + "\t\tremoved 3000 from middle");
    }
}
