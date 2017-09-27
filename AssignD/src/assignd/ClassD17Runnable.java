/*
 * For this program I tried to make it so that the only thing that is passed is
 *  a String, which helps keep the code in check.  If I wanted to keep some of
 *  the threads going I would have added a do while loop, so it would run at
 *  least once, then terminate, if "continue" variable allowd for it.
 *  I feel like it'd be usefull if thread 3 (mather) needed to send info back
 *  to another thread.
 */
package assignd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

/**
 *
 * @author T4d3
 */
public class ClassD17Runnable implements Runnable {

    private final ClassD17Mediator mediator;
    private final String name;
    private final Integer purpose;
    private String filePath;
    public Boolean shouldWait;

    public ClassD17Runnable(String name, ClassD17Mediator mediator, Integer purpose) {
        // The shouldWait is pretty sweet, because it can be changed any time,
        //  and that will "wake" the thread
        this.name = name;
        this.mediator = mediator;
        this.purpose = purpose;
        this.shouldWait = true;
    }

    // This is called by send(), but is more of a receive on this side
    void send(String message) {
        // Depending on the purpose, the message can mean different things
        //  It's important to do little work here, and leave it all to the thread
        switch (purpose) {
            case 1:
                System.out.println("ERROR: Case one shouldnt be here");
                break;
            case 2:
                this.filePath = message;
                // wake up the thread
                this.shouldWait = false;
                break;
            case 3:
                this.filePath = message;
                // wake up the thread
                shouldWait = false;
                break;
            default:
                System.out.println("Error: no purpose");
        }
    }

    private ArrayList<String> readFromFile() throws ParseException, IOException, JSONException {
        // This is private, and only called by the running thread.
        FileInputStream aFileStream = new FileInputStream(filePath);
        JSONInputStream objectIn
                = new JSONInputStream(aFileStream);
        ArrayList<String> thingToRead = (ArrayList<String>) objectIn.readObject();
        objectIn.close();
        return thingToRead;
    }

    private void writeToFile() {
        //get file path from wherever...  maybe a singleton.
        this.filePath = System.getProperty("user.home") + "\\Desktop\\JSONFile.txt";
        System.out.println("Writing to: " + this.filePath);

        // this is the big grand message, to be passed and worked on!
        ArrayList<String> thingToWrite = new ArrayList<>();
        thingToWrite.add("Tricked ");
        thingToWrite.add("You!  ");
        thingToWrite.add("There ");
        thingToWrite.add("is ");
        thingToWrite.add("no ");
        thingToWrite.add("math ");
        thingToWrite.add("here!");
        try {
            JSONOutputStream jsonOut = new JSONOutputStream(new FileOutputStream(filePath));
            jsonOut.writeObject(thingToWrite);
            jsonOut.close();
        } catch (IOException | JSONException e) {
            System.out.println(e);
        }
    }

    private void decodeString() {
        // read in the new file, and put it back into an array
        ArrayList<String> message = null;
        try {
// If I had time, or was passing this code off to someone else,
//  I would have made another varable, but the entire string
//  of the arrayList can fit into filePath.
//  It would be better to call it stringifiedList or something like that.
            message = (ArrayList<String>) JSONUtilities.parse(this.filePath);
        } catch (JSONException | ParseException ex) {
            System.out.println(ex);
        }
        System.out.println(message);
    }

// I made these with case statements, because they are all the same runnable,
//  but need to do something different.  From what I understand, this would
//  evolve naturaly, but my code isn't complez enough to have the same threads
//  evolve that way, so they are explicitly given a role.
    @Override
    public void run() {
        System.out.println("\t\t\tThread created: " + name);
        switch (purpose) {
            case 1:
                // hardcoded, to start this thread first
                shouldWait = false;
                while (shouldWait) {
                    System.out.println("ERROR: Writer not initiated");
                }
                writeToFile();
                mediator.fromRunnable("reader", filePath);
                break;

            case 2:
                shouldWait = true;
                while (shouldWait) {
                    //I cannot find a way to iterate through this while loop withough doing something
                    System.out.print("");
                }
                ArrayList<String> messageFromFile = new ArrayList<>();
                try {
                    messageFromFile = readFromFile();
                } catch (IOException | JSONException | ParseException e) {
                    System.out.println(e);
                }
                try {
                    mediator.fromRunnable("mather", JSONUtilities.stringify(messageFromFile));
                } catch (JSONException ex) {
                    System.out.println(ex);
                }
                break;

            case 3:
                while (shouldWait) {
                    //I cannot find a way to iterate through this while loop withough doing something
                    System.out.print("");
                }
                decodeString();
                break;
            default:
                System.out.println("ERROR: no purpose");
        }
        System.out.println("\t\t\t\t\tThread closing: " + name);
    }
}
