package com.eguevara.sandbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by erickguevara on 11/13/14.
 *
 *
 * Watch out for code that returns a value from the catch block and modifies it in the finally block. If a catch block returns a primitive data type, the finally block can’t modify the value being returned by it. If a catch block returns an object, the finally block can modify the value being returned by it.
 *
 */

public class TryCatchFinally {

    public static void main(String[] args) {
//        openFile();

        System.out.println(openFile4().toString());
    }

    private static void openFile() {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found");

            /*
            The return statement does not return the control to the main method before execution of
the finally block completes
             */

            return;

        } finally {
            System.out.println("finally");
        }
        System.out.println("Next task..");
    }


    private static int openFile2() {

        /**
         * If both catch and finally blocks define return statements, the calling method will
         receive a value from the finally block.
         */

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            return 10;

        } finally {
            return 20;
        }
    }


    private static int openFile3() {

        /**
         * If a catch block returns a primitive data type, the finally block can’t modify the value being returned by it.
         *
         * Control in the catch block copies the value of returnVal to be returned before it executes the finally block, so the returned value is not modified when finally executes.
         */

        int returnVal = 10;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            return returnVal; //primitive int

        } finally {
            returnVal +=10; //finally cant modify the value being returned if primitive
        }

        return returnVal;
    }

    private static StringBuilder openFile4() {

        /**
         *In this case, the catch block returns an object of the class StringBuilder. When the finally block executes, it can access the value of the object referred to by the variable returnVal and can modify it. The modified value is returned to the method main. Remember that primitives are passed by value and objects are passed by reference.         *
         */


        StringBuilder sb = new StringBuilder("start");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Catch");
            return sb; //object

        } finally {
            System.out.println("Finally");
            sb.append(" of the finally block"); //finally can modify object due to pass by reference
        }

        return sb;
    }
}
