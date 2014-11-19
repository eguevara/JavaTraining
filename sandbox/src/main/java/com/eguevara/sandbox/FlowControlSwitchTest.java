package com.eguevara.sandbox;

/**
 * Created by erickguevara on 11/18/14.
 * <p/>
 * Flow Control
 */
public class FlowControlSwitchTest {


    public static void main(String[] args) {

        int score = 100;

        if ((score = 100 + 10) == 200) ;

        System.out.println(score);


        boolean cond = false;
        if (cond) {
            System.out.println("true");
        } else {
            System.out.printf("False");
        }


        System.out.println("=======");

        /***
         * Works with no block {}.
         */
        String name = "Lion";
        if (name.equals("Lion"))
            for (int i = 0; i < 5; i++)
                System.out.println(i); //part of the for loop.

        /**
         * Switch statements accepts arguments from
         * byte, char,short, int, String
         *
         * Not Long, Double and Float
         *
         * Expressions can also be passed in as arguments as long as they
         * convert to the accepted types.
         */

        char c = 'c';
        switch (2 + c) { // Argument of the switch
            case 2: //values passed to the lable case
                System.out.println("Char c");
            default: {
                System.out.println("Default" + c);
            }
        }

        /**
         * Switch - Values passed to case label
         *
         * 1) Should be compile time constants, that is, the value should be
         * known at the time of code compilation.
         *
         *      ie.  case b+c: println() not allowed
         *      ie.  case 3+4: println() allowed.
         *
         * 2) will work in expression if the variable is final. because, values cant
         * be changed after initialized.
         *
         *
         * Note: If you don’t assign a value to a final variable
         * with its declaration, it isn’t considered a compile-time constant:
         *
         *  ie. final int var;
         *  var = 30;
         *
         *  3) Case values should be assignable to the argument passed to the switch
         *  statement.
         *
         *  4) Null is not allowed as a case label.
         *
         *  5) Cant have duplicate cases!.
         */

        int test = 3;
        final byte byteTest = 'c';
        switch (test) {  //compiles because byte can be assigned to int.
            case byteTest:
                System.out.println("Should Work");
        }


//        byte b = 33;
//        switch (b) {
//            case 3.3: // fails
//                System.out.printf("Error");
//        }


        System.out.println("++++++++");

        int decimalTest = 10/3;

        System.out.printf("decimalTest:" + decimalTest);


        String sTest = "MAR";
        switch (sTest) {

            default:
                System.out.println("no Months");
            case "Jan":
                System.out.println("Janurary");
                break;
            case "Feb":
                System.out.println("Feburary");
                break;

        }



    }
}
