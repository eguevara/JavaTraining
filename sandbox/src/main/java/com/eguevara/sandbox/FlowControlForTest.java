package com.eguevara.sandbox;

import java.util.ArrayList;

/**
 * Created by erickguevara on 11/23/14.
 */
public class FlowControlForTest {

    public static void main(String[] args) {

        /**
         * For loop (old style)
         *
         *
         * Defines three parts:
         *
         * Initialization statements
         * Termination condition
         * Update clause (executable statement)
         *
         * Initialization statement may define multiple statements
         *
         * Update statement may define multiple statues.
         *  And can call functions.  Will be called after the for block.
         *
         * Termination only one statement.
         *
         */

        int loop = 5;

        for (int i=0, x=1, z=2;
             i <loop;
             i++, ++x, z=i+x, printSomething()) {

            System.out.println(i);
            System.out.println(x);
            System.out.println(z);
            System.out.println("--");
        }


        System.out.println("++++++");
        /**
         * New for-each (enhanced)
         *
         * Used to iterate through collections.  Not to modify
         *
         * What happens when you try to modify the loop variable of an enhanced
         * for each statement?
         *
         * Depends on the type.
         *
         * For Primitives, the value does not change because the loop variable
         * is passed by value
         *
         * For Objects, the value does change because the loop variable
         * is passed by reference.
         */

        class Person {
            String firstName = "Guevara";
        }

        /**
         * Loop variable is a passed a reference.
         * Expect the object to be modified.
         */
        ArrayList<Person> aS = new ArrayList<>();
        aS.add(new Person());
        aS.add(new Person());

        for (Person name: aS)
            name.firstName = "Flores";

        for (Person name: aS)
            System.out.println("Name: " + name.firstName);

        /**
         * Loop variable is a passed value.
         * Do NOT expect the object to be modified.
         */
        int [] aI = { 10, 9};

        for (int name: aI)
            name = 23;

        for (int name: aI)
            System.out.println("Name: " + name);


    }
    public static void printSomething() {
        System.out.println("function print");
    }
}
