/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigne;

import java.util.HashMap;

/**
 *
 * @author T4d3
 */
public class PersonBean {

    private final String firstName;
    private final String lastName;
    private final char gender;
    private final Integer height;
    private final Integer weight;
    private final Integer shoeSize;

    public PersonBean(String firstName, String lastName, Integer height, char gender, Integer weight, Integer shoeSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.gender = gender;
        this.weight = weight;
        this.shoeSize = shoeSize;
    }

    public PersonBean(HashMap data) {
        this.firstName = (String) data.get("firstName");
        this.lastName = (String) data.get("lastName");
        this.gender = (char) data.get("gender");
        this.height = ((Long) data.get("height")).intValue();
        this.weight = ((Long) data.get("weight")).intValue();
        this.shoeSize = ((Long) data.get("shoeSize")).intValue();
    }
}
