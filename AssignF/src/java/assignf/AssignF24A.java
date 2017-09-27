/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignf;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
@WebServlet(urlPatterns = {"/AssignF"})
public class AssignF24A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("\tFORKED:  " + response);
        try {
            System.out.print("Connecting to Client...");

            JSONInputStream fromClient = new JSONInputStream(request.getInputStream());
            System.out.println("Success!");
            HashMap aRequest = (HashMap) fromClient.readObject();
            System.out.println(" Read data ");

            HashMap<String, Double> aResponse = new HashMap();

            aResponse.put("Response1", Math.pow((double) aRequest.get("number1"), (double) aRequest.get("number2")));
            aResponse.put("Response2", Math.pow((double) aRequest.get("number2"), (double) aRequest.get("number1")));
            aResponse.put("Response3", Math.sqrt((double) aRequest.get("number2")));
            aResponse.put("Response4", Math.sqrt((double) aRequest.get("number2")));
            // calculate y^x, x^y, the square root of x, and the square root of y */
            System.out.println("Sending: " + aResponse + "\t");

            JSONOutputStream toClient = new JSONOutputStream(response.getOutputStream());
            toClient.writeObject(aResponse);
        } catch (IOException | JSONException | ParseException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "This is my first servlet... here goes nothing.";
    }
}
