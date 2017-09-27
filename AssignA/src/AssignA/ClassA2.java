/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignA;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author T4d3
 */
public class ClassA2 {

    public ClassA2() {
        TreeMap<Integer, String> mapA2 = new TreeMap<>();
        Person one = new Person("Jessica", 22);
        Person two = new Person("Tad", 23);
        Person three = new Person("Jeff", 100);
        Person four = new Person("Sam", 11);
        Person five = new Person("David", 12);
        mapA2.put(one.getAge(), "One");
        mapA2.put(two.getAge(), "Two");
        mapA2.put(three.getAge(), "Thr");
        mapA2.put(four.getAge(), "Fou");
        mapA2.put(five.getAge(), "Fiv");

        this.printIt(mapA2);
    }

    private void printIt(TreeMap<Integer, String> mapA2) {
// example (1/11/2017) http://beginnersbook.com/2013/12/treemap-in-java-with-example/    }
        Set set = mapA2.entrySet();
        Iterator iterator = set.iterator();
        //while there is existing indexes...
        while (iterator.hasNext()) {
            //temp mapping variable to display
            Map.Entry currMap = (Map.Entry) iterator.next();
            System.out.print(" Key:" + currMap.getKey() + " Value:");
            System.out.print(currMap.getValue() + " | ");
        }
        System.out.println();
    }
}
