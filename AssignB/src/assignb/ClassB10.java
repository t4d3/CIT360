/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
class ClassB10 {

    private final String filePath = System.getProperty("user.home") + "\\Desktop\\JSONFile.txt";

    void part1to3() {
        System.out.println("List will be saved to:" + filePath);
// 1----------------------
        HashMap<Integer, Paint> paintStore = new HashMap();
// 2----------------------
        paintStore.put(1, new Paint("Pink", 5));
        paintStore.put(2, new Paint("White", 40));
        paintStore.put(3, new Paint("Green", 4));
        paintStore.put(4, new Paint("Teal", 16));
        paintStore.put(5, new Paint("Black", 1));
        paintStore.put(6, new Paint("Red", 6));
        paintStore.put(7, new Paint("Yellow", 11));
// 3----------------------
        try {
            FileOutputStream aFileStream = new FileOutputStream(filePath);
            JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
            jsonOut.writeObject(paintStore);
            jsonOut.close();
        } catch (IOException | JSONException e) {
            System.out.println(e);
        }
        System.out.println("File has been writen!");

    }

    void part4to5() {
// 4----------------------
        HashMap<Integer, Paint> newPaintStore = new HashMap<>();
        try {
            FileInputStream aFileStream = new FileInputStream(filePath);
            JSONInputStream objectIn
                    = new JSONInputStream(aFileStream);
            newPaintStore = (HashMap<Integer, Paint>) objectIn.readObject();
            objectIn.close();

        } catch (IOException | JSONException | ParseException e) {
            System.out.println(e);
        }
// 5----------------------
        System.out.println(newPaintStore.toString());
        /*
        * Looking at the file, it looks just like the stringify
        * method, but it's in a file.
        * Nothing too special looking.
         */
    }
}
