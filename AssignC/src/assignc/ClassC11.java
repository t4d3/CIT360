/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignc;

/**
 *
 * @author T4d3
 */
class ClassC11 {

    void go() {

        /*
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new ClassC11Runnable());
            thread.start();
        }
         */
        ClassC11Runnable one = new ClassC11Runnable();
        ClassC11Runnable two = new ClassC11Runnable();
        ClassC11Runnable three = new ClassC11Runnable();
        ClassC11Runnable four = new ClassC11Runnable();
        ClassC11Runnable five = new ClassC11Runnable();

        Thread threadOne = new Thread(one);
        threadOne.start();

        Thread threadTwo = new Thread(two);
        threadTwo.start();

        Thread threadThree = new Thread(three);
        threadThree.start();

        Thread threadFour = new Thread(four);
        threadFour.start();

        Thread threadFive = new Thread(five);
        threadFive.start();

        System.out.println();
    }
}
