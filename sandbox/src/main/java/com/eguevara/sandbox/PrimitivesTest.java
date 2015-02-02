package com.eguevara.sandbox;

/**
 * Created by erickguevara on 11/14/14.
 */
public class PrimitivesTest {

/**
 * A literal is a fixed value that does not need further
 * calculation before begin assigned to the variable.
 *
 */


    public static void main(String[] args) {


        /**
         * Boolean types only have true/false literals.
         */
        boolean bt = true;
        boolean bf = false;


        /**
         * Numberic data types stored as integers
         *
         * default type for number integers is int
         *
         * underscores are used in java 7 to improve readability
         *
         * Rules to remember on where to use underscores:
         *  can not follow the oct hex prefixes 0b, 0B, 0x, 0X
         *  can not start or end with _
         *  can not prefix L ie _L
         *
         *
         *  You can assign integer literals to
         *  binary (2)-> prefix 0b or 0B
         *  octal (8)-> prefix 0
         *  hexadecimal (16) (0-9|A-F) -> prefix 0x or 0X
         *
         */

        byte b = 3;  //Size: 8 bits, Range: -128  to 127
        short s = 3; //Size: 16 bits, -32k to 32
        int i = 10; //Size 32 bits
        long l = 33L; //Size 64 bits.

        int octVal = 0_143;



        /**
         * Numeric data types stored as decimals
         *
         * default data type for numeric decimals is double
         *
         * When using floats, you can tell the compiler to use the literal
         * as a float by adding f or F to the end.
         *
         * Cant use _ prior to suffix F or D or L
         * can not use _ after a decimal point.
         */

        float f = 33.33F;
        double d = 33.33D;


        //float f1 = 10.0; // Will not compile.. incompatible types.
        float f2 = (float) 20.0;
        double d1 = 20.0;
        
        /**
         * Charactoer data type
         *
         * Char are unsigned integer values (positive).  Trying to assign
         * a negative number will not compile.
         */

        char c = '1';
        char c1 = 2;

//        char c2 = -10; //error.. only positive integers can be assigned to char

//        i = c2; // can assign char to int



        System.out.println(c +  c1);

        i = s;
        i = c;
        i = i;

        l = c;
        l = i;
        l= s;

        f = i;
        f = c;
        f = c;
        f = s;

        d = f;
        d = i;
        d = c;
        d = s;


        int a12 = 10;
        long b12 = 20;
        short c12 = 30;
        float myFloat = 33.44f;

        boolean b1 = false;

        System.out.println("+++++++");

        System.out.println( a12 = 30);

        if (b1 = true) {
            System.out.println("erick");
        }

//        System.out.println(a12 + b12 + c12);


        /**
         * Identifiers
         *
         */


        int _var = 1;
//        int 0var  =3;  //can not start with 0

        int $dollar = 3; // can start with any currency char

        
        float test = 232;

        {
            test = 34;
        }
        
        
        Short sh1 = 9;
        Integer in1 = 10;
        
//        if (sh1 == in1) {
//            
//        }

        int[] a = { 2 };

        a[2] = 32;
        System.out.println(a[0]);
        
        
        
        short sh2 = 9;
        int in2 = 10;
        if (sh2 == in2) {
            
        }

    }
}
