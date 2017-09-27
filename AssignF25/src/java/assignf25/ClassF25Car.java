/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignf25;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author T4d3
 */
public class ClassF25Car implements Serializable {

    private String make;
    private Integer year;
    private Integer doors;
    private Boolean isManual;
    private Integer price;

    @Override
    public String toString() {
        return "{" + doors + " door, " + year + " " + make + ", $" + ((price == null) ? "UNDECIDED" : price) + "}";
    }

    public ClassF25Car(HashMap newCar) {
        this.make = (String) newCar.get("make");
        this.year = ((Long) newCar.get("year")).intValue();
        this.doors = ((Long) newCar.get("doors")).intValue();
        Object manualFlag = newCar.get("isManual");
        if (manualFlag != null) {
            this.isManual = (Boolean) manualFlag;
        }
        Object aPrice = newCar.get("price");
        if (aPrice != null) {
            this.price = ((Long) aPrice).intValue();
        }

    }

    public ClassF25Car(String make, Integer year, Integer doors) {
        this.make = make;
        this.year = year;
        this.doors = doors;

    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
