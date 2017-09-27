/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
class ClassB9 {

    private String ropeStoreString;

    public ClassB9() {

    }

    void go() {
        try {
            ropeStoreString
                    = "{\"3\":{\"material\":\"floss\",\"length\":3,\"color\":\"Pink\"}"
                    + ",\"5\":{\"material\":\"Nylon\",\"length\":5,\"color\":\"white\"}"
                    + ",\"23\":{\"length\":23,\"color\":\"Greenish, and gray\"}"
                    + ",\"68\":{\"length\":68,\"color\":\"Blue, with a thick yellow line\"}"
                    + ",\"100\":{\"length\":100,\"color\":\"Yellow\"}}";

            HashMap<String, HashMap> tempStore = (HashMap<String, HashMap>) JSONUtilities.parse(ropeStoreString);
            TreeMap<Integer, Rope> ropeStore = new TreeMap<>();

            // ropeStore.putAll(tempStore);
            // does not order the treeMap...

            Iterator<Map.Entry<String, HashMap>> iRope = tempStore.entrySet().iterator();
            while (iRope.hasNext()) {
                Map.Entry<String, HashMap> anEntry = iRope.next();
                Rope aRope = new Rope(anEntry.getValue());
                // Ignoring the given Key, beacuse
                 ropeStore.put( Integer.parseInt(anEntry.getKey()), aRope);
                // was failing...  no idea why
               // ropeStore.put(aRope.getLength(), aRope);
            }

            System.out.println(ropeStore);

        } catch (JSONException | ParseException ex) {
            System.out.println(ex);
        }
    }
}
