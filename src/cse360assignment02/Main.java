
/**
*
 * @author Dalin Yang
 * This the driver class for running and testing the AddingMachine.java
 *The adding machine could be used as a calculator to add and subtract numbers
 * and Recording the history of the operation
 *It's super useful! You gonna love it!
 *
 *
 * */




package cse360assignment02;

import cse360assignment02.AddingMachine;

public class Main {

    public static void main(String[] args) {
/**
 * Test cases for the adding machine
 */

        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add (6);
        myCalculator.subtract (22);
        myCalculator.add(100);
        System.out.println(myCalculator.toString());
        System.out.println("Total: " + myCalculator.getTotal());

/**
 * Running the clear function and print out the result after it.
 */
        myCalculator.clear();
        System.out.println("After clear: " + myCalculator.toString());
    }
}
