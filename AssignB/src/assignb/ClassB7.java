/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.util.ArrayList;
import java.util.Iterator;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

/**
 *
 * @author T4d3
 */
class ClassB7 {

    String carLotString;

    ClassB7() {
    }

    public void go() throws Exception {
        try {
            carLotString
                    = "[{\"make\":\"Ford\",\"year\":2007,\"doors\":0,\"isManual\":false},"
                    + "{\"make\":\"Chevy\",\"year\":1994,\"doors\":0,\"isManual\":false},"
                    + "{\"make\":\"Nissan\",\"year\":2000,\"doors\":0,\"isManual\":false},"
                    + "{\"make\":\"Toyota\",\"year\":2017,\"doors\":0,\"isManual\":false},"
                    + "{\"make\":\"Subaru\",\"year\":2004,\"doors\":0,\"isManual\":false}]";
            ArrayList<Car> carLot
                    = (ArrayList) JSONUtilities.parse(carLotString);
            Iterator<Car> iCar = carLot.iterator();
            while (iCar.hasNext()) {
                System.out.println(iCar.next());
            }
        } catch (JSONException e) {
        }

//            System.out.println(asdfCar);
        // } 
    }

}
