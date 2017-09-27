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
class ClassD16 {

    void go() {
        ClassD16Singleton aSingleton = ClassD16Singleton.getInstance();

        System.out.println("User name:\t" + aSingleton.getUserName());
        System.out.println("Status:\t\t" + aSingleton.getStatus());
        System.out.println("Can progress:\t" + aSingleton.canMoveOn());
        System.out.println("Score:\t\t" + aSingleton.getScore());
        System.out.println("Working dir:\t" + aSingleton.getWorkingDirectory());
    }
}