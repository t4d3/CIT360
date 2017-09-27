/*
 * After puting synchronized in the run declare line, everything worked as you'd expect.
 * it added 1-100 twice in a row, then removed every other number after eachother
 */
package assignc;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
class ClassC15 {

    void go() {
        ArrayList<Integer> collisionNumbers = new ArrayList<>();

        Executor anExecutor = Executors.newFixedThreadPool(4);
        anExecutor.execute(new ClassC14Runnable2(collisionNumbers));
        anExecutor.execute(new ClassC14Runnable2(collisionNumbers));
        anExecutor.execute(new ClassC14Runnable3(collisionNumbers));
        anExecutor.execute(new ClassC14Runnable3(collisionNumbers));
    }
}
/*
    Duplicate the three classes in assignment 16. 
    Synchronize on the Collection or Map stored as a property in your 2nd and 3rd classes.
    Run this code.
    Write comments in your class’s main method describing what you saw in the 
    console and conclusions you’ve drawn from what you saw
 */
