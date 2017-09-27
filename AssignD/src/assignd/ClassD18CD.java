/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignd;

/**
 *
 * @author T4d3
 */
public class ClassD18CD {

    private final String album;
    private final Integer numTracks;
    private final String artist;

    public ClassD18CD(String album, Integer numTracks, String artist) {
        this.album = album;
        this.numTracks = numTracks;
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getNumTracks() {
        return numTracks;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return numTracks + " Tracks" + "\t" + artist + "\t" + album;
    }
}
