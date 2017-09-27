package com.doing.more.java.appcontrol;

import com.doing.more.java.appcontrol.Handler;
import java.io.IOException;
import org.quickconnectfamily.json.JSONOutputStream;

import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;


public class SpeakHandler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        try{
            JSONOutputStream outToClient = (JSONOutputStream)dataMap.remove("toClient");
            System.out.println("Just got:" + dataMap + " from client");
            dataMap.put("command", "Done");
            outToClient.writeObject(dataMap);
            System.out.println("just sent "+dataMap);
        } catch (IOException | JSONException e) {
        }
    }
}