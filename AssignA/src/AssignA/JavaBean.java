/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignA;

/**
 *
 * @author T4d3
 */
class JavaBean {
 private String name;
 private int size;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public JavaBean(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
}
