/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.util.TreeMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

/**
 *
 * @author T4d3
 */
class ClassB8 {

    private TreeMap<Integer, Rope> ropeStore;

    void go() {
        ropeStore = new TreeMap<>();
        Rope one = new Rope("Nylon", 5, "white");
        Rope two = new Rope("floss", 3, "Pink");
        Rope three = new Rope(68, "Blue, with a thick yellow line");
        Rope four = new Rope(23, "Greenish, and gray");
        Rope five = new Rope(100, "Yellow");

        ropeStore.put(one.getLength(), one);
        ropeStore.put(two.getLength(), two);
        ropeStore.put(three.getLength(), three);
        ropeStore.put(four.getLength(), four);
        ropeStore.put(five.getLength(), five);

        try {
            System.out.println(JSONUtilities.stringify(ropeStore));
        } catch (JSONException e) {
            System.out.println(e.toString());
        }
    }

}
