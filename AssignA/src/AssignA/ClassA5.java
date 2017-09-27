/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignA;

import java.util.Stack;

/**
 *
 * @author T4d3
 */
class ClassA5 {
    
    public ClassA5() {
        Stack stackA5 = new Stack();
        stackA5.add(new JavaBean("one", 1));
        stackA5.add(new JavaBean("two", 2));
        stackA5.add(new JavaBean("three", 3));
        stackA5.add(new JavaBean("four", 4));
        stackA5.add(new JavaBean("five", 5));
        System.out.println("Created queue: " + stackA5);
        
        this.removeItem(stackA5, 0);
        this.removeItem(stackA5, 0);
        System.out.println(stackA5);
        this.addItem(stackA5, new JavaBean("six", 6));
        this.addItem(stackA5, new JavaBean("seven", 7));
        this.addItem(stackA5, new JavaBean("eight", 8));
        System.out.println(stackA5);
    }
    
    private void removeItem(Stack currStack, int i) {
        System.out.print("Removing " + currStack.elementAt(i));
        currStack.remove(i);
        System.out.println("Removed item " + i);
    }
    
    private void addItem(Stack currStack, JavaBean javaBean) {
        System.out.println("Adding " + javaBean + "to end of queue.");
        currStack.addElement(javaBean);
    }
}
