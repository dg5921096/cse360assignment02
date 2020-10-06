package cse360assignment02;

import cse360assignment02.AddingMachine;

public class Main {

    public static void main(String[] args) {

        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add (6);
        myCalculator.subtract (22);
        myCalculator.add(100);
        System.out.println(myCalculator.toString());
        System.out.println("Total: " + myCalculator.getTotal());


        myCalculator.clear();
        System.out.println("After clear: " + myCalculator.toString());
    }
}
