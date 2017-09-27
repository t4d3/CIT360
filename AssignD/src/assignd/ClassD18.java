/*
 * 8. Write a class with a main method. Write several classes that represent a
video and audio library system. Include Appropriate JavaBeans. Write a class
that follows the façade pattern to simplify interactions with the video and
audio library system.
 */
package assignd;

/**
 *
 * @author T4d3
 */
class ClassD18 {

    void go() {
        ClassD18Facade mediaServer = new ClassD18Facade();
        System.out.println("\n-----displayMovies");
        mediaServer.displayDVDs();

        System.out.println("----------addMovie");
        mediaServer.addDVD("Spectre", 148, "PG-13");

        System.out.println("---------removeDVD");
        mediaServer.removeDVD("Mad Max");

        System.out.println("\n-----displayMovies");
        mediaServer.displayDVDs();

        System.out.println("\n--------displayCDs");
        mediaServer.displayAlbums();

        System.out.println("----------removeCD");
        mediaServer.removeCD("Californication");

        System.out.println("----------addAlbum");
        mediaServer.addAlbum("Coexist", 11, "The xx\t\t");

        System.out.println("\n--------displayCDs");
        mediaServer.displayAlbums();

    }
}
