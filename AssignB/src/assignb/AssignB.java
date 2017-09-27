/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignb;

/**
 *
 * @author T4d3
 */
public class AssignB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("B6---------------");
        ClassB6 classB6 = new ClassB6();
        classB6.go();

        System.out.println("B7---------------");
        ClassB7 classB7 = new ClassB7();
        try {
            classB7.go();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("B8---------------");
        ClassB8 classB8 = new ClassB8();
        classB8.go();

        System.out.println("B9---------------");
        ClassB9 classB9 = new ClassB9();
        classB9.go();

        System.out.println("B10---------------");
        ClassB10 classB10 = new ClassB10();
        classB10.part1to3();
        classB10.part4to5();

    }
}
