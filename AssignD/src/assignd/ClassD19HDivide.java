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
public class ClassD19HDivide implements ClassD19Handler {

    @Override
    public void handleIt(HashMap<String, Integer> data) {
        data.put("third", data.get("first") / data.get("second"));
        System.out.println("Dividing\t" + data.get("first") + " / "
                + data.get("second") + " = " + data.get("third"));

    }
}
