/*
 * Write a class with a main method. Write code for an ApplicationController class and a
 * Handler interface. Write 5 classes that implement Handler. Have each of your Handler
 * classes do something different. Also, write to the console which command is being
 * sent, what data is sent with the command, and which Handler instance is being called.
 * In your main method, instantiate an instance of ApplicationController. Add instances of
 * all your Handlers to the app controller instance, and write code that uses the
 * ApplicationController instance to send data to each of your Handlers.
 */
package assignd;

import java.util.HashMap;

/**
 *
 * @author T4d3
 */
class ClassD19 {

    void go() {
        ClassD19Controller controller = new ClassD19Controller();

        controller.addHandle("add", new ClassD19HAdd());
        controller.addHandle("divide", new ClassD19HDivide());
        controller.addHandle("stubtract", new ClassD19HStubtract());
        controller.addHandle("multiply", new ClassD19HMultiply());
        controller.addHandle("display", new ClassD19HDisplay());

        HashMap<String, Integer> data = new HashMap<>();
        data.put("first", 6);
        data.put("second", 2);
        data.put("third", 0);

        controller.mather("display", data);
        controller.mather("divide", data);
        controller.mather("add", data);
        controller.mather("stubtract", data);
        controller.mather("multiply", data);
        controller.mather("display", data);

    }
}

/*

            __________________________
           (_________________________@)
           /  |  |  |  |  |  |  |  || `\
           |__|__|__|__|__|__|__|__||___\
           |===================  18 | : |`'-._
 .::.     _|    .-.                 | : | ,===`\
 ':::''  '=|___/.-.\________________|_:_|_/.-.\|
               \'-'/                      \'-'/
          jgs   '-'                        '-'

 */
