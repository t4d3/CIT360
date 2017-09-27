/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignA;

import java.util.HashMap;

/**
 *
 * @author T4d3
 */
public class ClassA1 {

    public ClassA1() {
//create a new HashMap called mapA1, which default constructor is
//defined by a String and Integer.
        HashMap<String, Integer> mapA1 = new HashMap<>();
//Insert 5 items into the HashMap
        mapA1.put("foo", 4);
        mapA1.put("bar", 2);
        mapA1.put("gate", 13);
        mapA1.put("fence", 6);
        mapA1.put("book", 1000);
//Print the HashMap to the console
        System.out.println(mapA1);
    }
}
