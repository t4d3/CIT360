/*
 * Write two classes (1 & 2) that have main methods. 1 is a client app and 2 is a server
app. Give these classes any appropriate name. Write code that connects the client
app to the server app. Have the client send two numeric values to the server. Write
code for the server so when it receives the two numbers it adds, subtracts, multiplies,
and divides them and sends the results back to the client. Have the client display the
results in the console.
 */
package assigne;

/**
 *
 * @author T4d3
 */
class ClassE20 {

    void go() {
       // ClassE20Client client = new ClassE20Client();
        ClassE20Server server = new ClassE20Server();
        server.go();
       // client.go();
    }
}
