/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignA;

import java.util.HashSet;

/**
 *
 * @author T4d3
 */
class ClassA3 {

    public ClassA3() {
        HashSet<Building> firstSet = new HashSet<>();
        HashSet<Building> secondSet = new HashSet<>();

        Building one = new Building("Walmart", 30);
        Building two = new Building("Broulims", 26);
        Building three = new Building("Subway", 15);
        Building four = new Building("Library", 45);
        Building five = new Building("McDonalds", 23);
        Building six = new Building("Church", 34);
        Building seven = new Building("Apartment", 40);
        Building eight = new Building("BlockBuster", 29);
        firstSet.add(one);
        firstSet.add(two);
        firstSet.add(three);
        firstSet.add(four);  //doubles
        firstSet.add(five);  //....
        secondSet.add(four); //....
        secondSet.add(five); //....
        secondSet.add(six);
        secondSet.add(seven);
        secondSet.add(eight);
//this has a better method... found at https://docs.oracle.com/javase/7/docs/api/java/util/AbstractCollection.html
        this.printUnion(firstSet, secondSet);
        this.printIntersection(firstSet, secondSet);
        this.printRealativeCompliment(firstSet, secondSet);

    }

    private void printUnion(HashSet<Building> firstSet, HashSet<Building> secondSet) {
        System.out.print(" 1.Union\t\t");
        boolean toPrint = false;
        boolean hasPrinted = false;
        for (Building tempOne : firstSet) {
            for (Building tempTwo : secondSet) {
                if (tempOne.equals(tempTwo)) {
                    toPrint = true;
                }
                if (!toPrint && !hasPrinted) {
                    System.out.print(tempTwo);
                }
            }
            if (!toPrint) {
                System.out.print(tempOne);
            }
            hasPrinted = true;
            toPrint = false;
        }
        System.out.println();
    }

    private void printIntersection(HashSet<Building> firstSet, HashSet<Building> secondSet) {
        System.out.print(" 2.Intersection\t\t");
        for (Building tempOne : firstSet) {
            for (Building tempTwo : secondSet) {
                if (tempOne.equals(tempTwo)) {
                    System.out.print(tempOne);
                }
            }
        }
        System.out.println();
    }

    private void printRealativeCompliment(HashSet<Building> firstSet, HashSet<Building> secondSet) {
        System.out.print(" 3.RealativeCompliment\t");
        boolean toPrint = false;
        boolean hasPrinted = false;
//check the right realativ compliment
        for (Building tempOne : firstSet) {
            for (Building tempTwo : secondSet) {
                if (tempOne.equals(tempTwo)) {
                    toPrint = true;
                }
            }
            if (!toPrint) {
                System.out.print(tempOne);
            }
            hasPrinted = true;
            toPrint = false;
        }
//check the left realativ compliment        
        for (Building tempOne : secondSet) {
            for (Building tempTwo : firstSet) {
                if (tempOne.equals(tempTwo)) {
                    toPrint = true;
                }
            }
            if (!toPrint) {
                System.out.print(tempOne);
            }
            hasPrinted = true;
            toPrint = false;
        }
        System.out.println();
    }

}
