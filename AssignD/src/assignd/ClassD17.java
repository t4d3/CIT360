/*
Write a class with a main method. Write a mediator class to handle communication
between 4 instances of a second class that implements Runnable of your own design
and 2 instances of a third class that implements Runnable of your own design. In your
main method write all necessary code to run your implementations of Runnable in
separate threads. Write to the console all messages sent between your instances of
Runnable.
 */
package assignd;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author T4d3
 */
class ClassD17 {

    void go() {
        HashMap<String, ClassD17Runnable> threads = new HashMap<>();

        ClassD17Mediator mediator = new ClassD17Mediator(threads);

        threads.put("writer", new ClassD17Runnable("writer", mediator, 1));
        threads.put("reader", new ClassD17Runnable("reader", mediator, 2));
        threads.put("mather", new ClassD17Runnable("mather", mediator, 3));

//start threads
        for (String currentKey : threads.keySet()) {
            new Thread(threads.get(currentKey)).start();
        }
    }
}
