
package cse360assignment02;

import java.lang.*;

public class AddingMachine {
    private int total;
    StringBuffer history;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = new StringBuffer("0");
    }

    public int getTotal () {
        return this.total;
    }

    public void add (int value) {

        this.total += value;
        history.append(" + " + value);

    }


    public void subtract (int value) {
        total -= value;
        history.append(" - " + value);
    }

    public String toString () {
        return history.toString();
    }

    public void clear() {
        history = new StringBuffer("0");
        total = 0;
    }
}