package com.eguevara.sandbox;

/**
 * Testing inner static and non-static class.
 *
 * Also, inner method classes
 *
 * Created by erickguevara on 10/23/14.
 */
public class Car {

    long mId = 0L;

    public Car() {

    }

    public void start() {
        System.out.println("Starting Car: " + mId);

        //Instanistae inner class
        TimeMachine tm = new TimeMachine();
        tm.start();

        final String name = "Erick";

        // Sometimes it's useful to create local classes
        // within methods. You can use them only within the method.
        //Can access instance variables
        //can only access local variables if they are final
        class Temp {
            public void doSomething() {
                System.out.println("ID is: " + mId); //instance
                System.out.println("My name is " + name); //local final
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }

    /**
     * Non-static inner class.  Has access to instanct varibles
     */

    private class TimeMachine {

        private void start() {
            System.out.println("Starting TimeMachine" + mId);
        }

    }

    /**
     * Static inner Class. Does not have access to instance variables.
     * Really like a normal class, only that its grouped with the outer class
     */

    public static class FlauxCapacitor {

        public void start() {
            System.out.println("Starting the FluaxCapacitor: ");
        }
    }


}
