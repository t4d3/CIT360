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
public class Paint implements Serializable{
   
    private String color;
    private int amount;
    private float cost;

    @Override
    public String toString() {
        return "Paint{" + "color=" + color + ", amount=" + amount + ", cost=" + cost + '}';
    }

    public Paint(String color, int amount) {
        this.color = color;
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
