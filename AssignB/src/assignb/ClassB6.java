/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.io.Serializable;
import java.util.ArrayList;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

/**
 *
 * @author T4d3
 */
class ClassB6 {

    private ArrayList<Car> carLot;

    ClassB6() {
    }

    public void go() {
        carLot = new ArrayList<>();
        carLot.add(new Car("Ford", 2007));
        carLot.add(new Car("Chevy", 1994));
        carLot.add(new Car("Nissan", 2000));
        carLot.add(new Car("Toyota", 2017));
        carLot.add(new Car("Subaru", 2004));

        try {
            System.out.println(JSONUtilities.stringify(carLot));
        } catch (JSONException e) {
            System.out.println(e.toString());
        }
        // Use QCJSON’s stringify method to get a string representation
        //of the ArrayList instance and the JavaBeans. Print the String
        //to the console.
    }
}
