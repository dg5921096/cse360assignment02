

/**
 *
 * @author Dalin Yang
 * This the class of AddingMachine.java
 *The adding machine could be used as a calculator to add and subtract numbers
 * and Recording the history of the operation
 *It's super useful! You gonna love it!
 *
 *
 * */

package cse360assignment02;

import java.lang.*;

public class AddingMachine {
    private int total;
    StringBuffer history;

    /**
     * constructor of the AddingMachine to initialize the instance total and history.
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = new StringBuffer("0");
    }

    /**
     * getTotal function is the getter of the total instance
     */
    public int getTotal () {
        return this.total;
    }

    /**
     * the add function to operate the adding to value.
     * @param value
     */
    public void add (int value) {

        total = total + value;
        history.append(" + " + value);

    }
    /**
     * the add function to operate the subtracting to value.
     * @param value
     */

    public void subtract (int value) {
        total = total - value;
        history.append(" - " + value);
    }

    /**
     * toString is the function to return the history result in string format.
     */
    public String toString () {
        return history.toString();
    }


    /**
     * clear function to clean the data in the history object and the total instance.
     */
    public void clear() {
        history = new StringBuffer("0");
        total = 0;
    }
}