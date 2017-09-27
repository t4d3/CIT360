/*
 * Write new client and server classes. Design a JavaBean that you have not used
before. Use QCJSON input and output streams in the client to send and receive an
instance of the JavaBean to the server. On the server use a thread pool of your
choice so more than one client can use the server at any given time. Use QCJSON
input and output streams to receive data from and send data to the client. Do some
appropriate calculation with the data received and send a Collection of your choice
back to the client.
 */
package assigne;

/**
 *
 * @author T4d3
 */
class ClassE22 {

    public ClassE22() {
    }

    void go() {
        ClassE22Server server = new ClassE22Server();
        server.go();
    }
}
