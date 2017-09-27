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
public class ClassD19Controller {

    private final HashMap<String, ClassD19Handler> handles = new HashMap<>();

    public void ClassD19Controller() {

    }

    public void mather(String command, HashMap<String, Integer> data) {
        handles.get(command).handleIt(data);
    }
    
    public void addHandle(String name, ClassD19Handler classD19HDrive) {
        handles.put(name, classD19HDrive);
    }

}
