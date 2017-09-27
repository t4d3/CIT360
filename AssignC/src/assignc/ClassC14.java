/*
 * From what I see, it looks like it added the numbers together
 * (1 - 100, 1 - 100), and then removed the even numbers...
 * nothing too crazy, it only doubled up on adding numbers.
 */
package assignc;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
class ClassC14 {

    void go() {

        ArrayList<Integer> collisionNumbers = new ArrayList<>();

        Executor anExecutor = Executors.newFixedThreadPool(4);
        anExecutor.execute(new ClassC14Runnable2(collisionNumbers));
        anExecutor.execute(new ClassC14Runnable2(collisionNumbers));
        anExecutor.execute(new ClassC14Runnable3(collisionNumbers));
        anExecutor.execute(new ClassC14Runnable3(collisionNumbers));

        // ClassC14Runnable2 collision11 = new ClassC14Runnable2(collisionNumbers);
        // ClassC14Runnable2 collision12 = new ClassC14Runnable2(collisionNumbers);
        // collision11.run();
        // collision12.run();
        // ClassC14Runnable3 collision21 = new ClassC14Runnable3(collisionNumbers);
        // ClassC14Runnable3 collision22 = new ClassC14Runnable3(collisionNumbers);
        // collision21.run();
        // collision22.run();

        /*
-- Write two classes (classes 2 & 3) (different from the ones in previous assignments ) that implement Runnable in separate .java files.
-- Add a constructor for these classes that store a Collection or Map type of your choice as a property. 
-- In class 2’s run method add all the numbers from 1 - 100 to the instance’s property that is the Collection or Map. 
-- In the second class the second class’s run method execute code that removes all even numbers from the Collection or Map that is the instance’s property. 
-- At the end of the run methods of classes 2 & 3 print the Collection or Map to the console. 
-- In the main method of your first class instantiate an instance of your Collection or Map. 
-- Add noting to it and use it to construct 2 instances of your second class and two instances of your third class. 
Instantiate 4 Threads and execute the 4 instances of your 2nd and 3rd classes. Write comments in your class’s main method describing what you saw in the console and conclusions you’ve drawn from what you saw
         */
    }

}
