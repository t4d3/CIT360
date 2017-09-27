/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignd;

import java.util.ArrayList;

/**
 *
 * @author T4d3
 */
public class ClassD18Facade {

    private final ClassD18LibraryDVD movieLibrary;
    private final ClassD18LibraryCD CDLibrary;

    private final ArrayList<ClassD18CD> mp3s = new ArrayList<>();

    public ClassD18Facade() {
        CDLibrary = new ClassD18LibraryCD();
        movieLibrary = new ClassD18LibraryDVD();
    }

    void addDVD(String title, Integer length, String rating) {
        movieLibrary.add(new ClassD18DVD(title, length, rating));
    }

    void addAlbum(String album, Integer numTracks, String artist) {
        CDLibrary.addAlbum(new ClassD18CD(album, numTracks, artist));
    }

    void displayDVDs() {
        movieLibrary.displayMovieLibrary();
    }

    void displayAlbums() {
        CDLibrary.displayAlbums();
    }

    void removeCD(String album) {
        CDLibrary.removeAlbum(album);
    }

    void removeDVD(String title) {
        movieLibrary.removeDVD(title);
    }
}
