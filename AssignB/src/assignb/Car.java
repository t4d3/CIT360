/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.io.Serializable;

/**
 *
 * @author T4d3
 */
public class Car implements Serializable {

    private String make;
    private int year;
    private int doors;
    private boolean isManual;

    @Override
    public String toString() {
        return make + ", " + year + " | ";
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isIsManual() {
        return isManual;
    }

    public void setIsManual(boolean isManual) {
        this.isManual = isManual;
    }
}
