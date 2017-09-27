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
class ClassD18LibraryCD {

    private final ArrayList<ClassD18CD> cds;

    public ClassD18LibraryCD() {
        cds = new ArrayList<>();
        cds.add(new ClassD18CD("Toxicity", 14, "System of a Down"));
        cds.add(new ClassD18CD("Continued Silence EP", 6, "Imagine Dragons\t"));
        cds.add(new ClassD18CD("Guero", 13, "Beck\t\t"));
        cds.add(new ClassD18CD("Make Believe", 12, "Weezer\t\t"));
        cds.add(new ClassD18CD("California", 16, "Blink-182\t"));
        cds.add(new ClassD18CD("Californication", 15, "Red Hot Chili Peppers"));
    }

    public void addAlbum(ClassD18CD classD18Audio) {
        cds.add(classD18Audio);
    }

    public void displayAlbums() {
        System.out.println("Num. Tracks\tArtist\t\t\tTitle\n-----------\t----------------\t----------");
        cds.forEach((cd) -> {
            System.out.println(cd);
        });
    }

    public void removeAlbum(String album) {
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getAlbum().equals(album)) {
                cds.remove(i);
            }
        }
    }
}
