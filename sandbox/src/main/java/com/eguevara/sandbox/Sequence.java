package com.eguevara.sandbox;

/**
 *
 * Practice question for exam
 * to see what order the statements get printed when running.
 *
 * Created by erickguevara on 10/14/14.
 */



public class Sequence {

    /**
     * no-argument Constructor
     */
    Sequence() {
        System.out.println("Constructor ");
    }

    /**
     * Anonymous code block called as a prefix to each constructor
     */
    {
        System.out.println("Anonymous ");}


    /**
     * Main method of the class
     * @param args
     */
    public static void main(String[] args) {

        new Sequence().go();
    }

    void go() {
        System.out.println("Go ");
    }

    /**
     * Static initializer block gets called first at launch
     */
    static {
        System.out.println("Static");
    }
}
