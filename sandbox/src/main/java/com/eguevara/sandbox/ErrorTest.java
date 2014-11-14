package com.eguevara.sandbox;

import java.util.ArrayList;

/**
 * Created by erickguevara on 10/27/14.
 */


class DogBitesException extends Exception {
}

class DogPeesExceptions extends Exception {
}


public class ErrorTest {

    static void dogWalkTest(boolean passed) throws DogBitesException {

        System.out.println("Dog Walk by Dog test");

        if (!passed) {
            throw new DogBitesException();
        }

    }

    static void dogPottyTest(boolean passed) throws DogPeesExceptions {

        System.out.printf("Dog Potty Test");

        if (!passed) {
            throw new DogPeesExceptions();
        }
    }

    static int testReturnedValuesFromCatch() {

        int returnValue = 10;

        try {

            String [] students = {"erick", "frank"};
            System.out.println(students[5]);
        } catch (Exception e) {

            System.out.println("Aboyt to return" + returnValue);
            return returnValue;

        } finally {
            returnValue += 10;
            System.out.println("Finally returnvalue: " + returnValue);
        }

        return returnValue;
    }


    static ArrayList<String> testList = null;
    ArrayList<String> testStringList;

    public static void main(String[] args) {



//        testList.add("erick");

//        ErrorTest et = new ErrorTest();
//        et.testStringList.add("testing");


        try {
            dogWalkTest(true);
            dogPottyTest(false);

            System.out.println("You have an awesome dog!");

        } catch (DogBitesException e) {
            System.out.println("Dog needs work with other dogs");
        } catch (DogPeesExceptions e) {
            System.out.println("Dog needs some house training");
        } finally {
            System.out.println("You need to pay for the Training");
        }

        System.out.println("**End of TXN**");


        System.out.println("***************");

        System.out.println(testReturnedValuesFromCatch());

    }


}
