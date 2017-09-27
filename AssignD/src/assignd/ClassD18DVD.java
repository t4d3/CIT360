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
public class ClassD18DVD {

    private final String title;
    private final Integer length;
    private final String rating;

    public ClassD18DVD(String title, Integer length, String rating) {

        this.title = title;
        this.length = length;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Integer getLength() {
        return length;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return length + " Minutes\t" + rating + "\t" + title;
    }
}
