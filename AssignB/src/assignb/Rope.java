/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author T4d3
 */
public class Rope implements Serializable {
    private String material;
    private int length;
    private String color;

    @Override
    public String toString() {
        return "Rope{" + "length=" + length + ", color=" + color + '}';
    }

    public Rope(HashMap tempRope) {
        this.material = (String) tempRope.get("material");
        this.length = ((Long)tempRope.get("length")).intValue();
        this.color = (String) tempRope.get("color");
    }

    public Rope(String material, int length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rope(int length, String color) {
        this.length = length;
        this.color = color;
    }
}
