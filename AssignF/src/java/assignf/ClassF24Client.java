package assignf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*
24. Create a new web application project as instructed by the help documentation for your
    IDE. In this project
  1. write a Servlet called anything you want. Have the servlet
    1. get two numbers (x and y) from the client using a QCJSON input stream
    2. calculate y^x, x^y, the square root of x, and the square root of y
    3. send the calculation results to the client using a QCJSON output stream
  2. write a new class named anything you want that has a main method (this will be
     the client for your servlet). The client should
    1. get two numbers from the user
    2. use an instance of HTTPURLConnection instead of Socket instances to
       connect to the Servlet
    3. send the two numbers to the your Servlet using a QCJSON output stream
    4. get the calculations back from the Servlet using a QCJSON input stream
    5. display the calculated results in the console
 */
/**
 *
 * @author T4d3
 */
public class ClassF24Client {

    public static void main(String[] args) {

        System.out.println("Starting client");

        Executor anExecutor = Executors.newFixedThreadPool(3);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double number1 = 0.0;
        Double number2 = 0.0;

        Boolean noError;
        do {
            noError = true;
            try {
                System.out.print("Enter number 1: ");
                String input1 = br.readLine();
                System.out.print("Enter number 2: ");
                String input2 = br.readLine();

                number1 = Double.parseDouble(input1);
                number2 = Double.parseDouble(input2);
            } catch (NumberFormatException | IOException e) {
                noError = false;
                System.out.println("Be sure to enter numbers!");
            }
        } while (!noError);

        // */
        HashMap<String, Double> message = new HashMap();
        System.out.println("Numbers are: " + number1 + " and " + number2);
        message.put("number1", number1);
        message.put("number2", number2);
        ClassF24ClientRunnable clientConnection = new ClassF24ClientRunnable(message);
        anExecutor.execute(clientConnection);

    }
}
