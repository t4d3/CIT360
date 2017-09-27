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
public class ClassD18LibraryDVD {

    private final ArrayList<ClassD18DVD> dvds;

    public ClassD18LibraryDVD() {
        dvds = new ArrayList<>();
        dvds.add(new ClassD18DVD("The Martian", 165, "PG-13"));
        dvds.add(new ClassD18DVD("Mad Max", 120, "R"));
        dvds.add(new ClassD18DVD("Inside Out", 94, "G"));
        dvds.add(new ClassD18DVD("Star Wars: The Force Awakens", 136, "PG-13"));
        dvds.add(new ClassD18DVD("Jurassic World", 124, "PG-13"));
        dvds.add(new ClassD18DVD("Avengers: Age of Ultron", 141, "PG-13"));
    }

    public void add(ClassD18DVD dvd) {
        dvds.add(dvd);
    }

    public void displayMovieLibrary() {                
        System.out.println("Length\t\tRating\tTitle\n-----------     ------  ---------");
        dvds.forEach((movie) -> {
            System.out.println(movie);
        });
    }

    public void removeDVD(String title) {
        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).getTitle().equals(title)) {
                dvds.remove(i);
            }
        }
    }

}
