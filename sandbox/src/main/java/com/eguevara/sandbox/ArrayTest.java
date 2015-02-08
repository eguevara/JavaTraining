package com.eguevara.sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by erickguevara on 10/18/14.
 */


interface Jump {}
class Animal implements Jump {}


interface MyInterface {}
class MyClass1 implements MyInterface {}
class MyClass2 implements MyInterface {}


public class ArrayTest {


    public static void main(String[] args) {


        /**
         * Testing arrays with int and upper casts
         */


        int [] intArray = new int[6];

        byte b = 1;
        short s = 2;
        char c = '3';

        float f = 3.44F;
        long l = 3323L;
        double d = 34.33;


        int i = 4;

        intArray[0] = b; //ok byte
        intArray[1] = s; //ok short
        intArray[2] = c; //ok char
        intArray[3] = i; //ok int
//        intArray[4] = f; //compile error float
//        intArray[5] = l; //compile error long
//        intArray[6] = d; //compile error double


        for (int thing: intArray) {
            System.out.println(thing);
        }



        MyInterface[] interfaceArray = {
                null,
                new MyInterface() {
                },
        new MyClass1(),
        new MyClass2()};

        for (MyInterface obj : interfaceArray) {
            System.out.println(obj);
        }


        ArrayList<String> myArrList = new ArrayList<>();


        System.out.println("++++++++++");

        Jump [] eJump = {null, null};

        Jump [] ej2 = new Animal[22];
        Jump [] ej3 = new Jump[2];


        ArrayList<String> as = new ArrayList<String>();
        as.add(0,"erick");
        as.add(0,"guevara");
        as.add(1,"ivan");


        for (String as2: as){
            System.out.printf(as2);
        }

        System.out.println("++++++++");



        /**
         *  Testing Arrays.  Delcare and instaiate and initialize
         */


        int [] numbers = {1,2,3,4,5};

        System.out.println(numbers.length);
        System.out.println(numbers[4]);


        /**
         * Declare first, then instatiate, then initialize
         *
         */


        int [] number1; //Declare

//        array_name = new type [length]
        number1 = new int[5]; //Instaitate
        number1[0] = 3; //declare

        System.out.println(number1[4]);

        /**
         * Mulit-Demisiaonal Arrays
         * An Array within an Array.
         */

        int [][] doubleNumbers = new int[3][4];
        doubleNumbers[1][0] = 10;

        //OR

        int doubleNumbers2 [][]; //declare
        doubleNumbers2 = new int [2][4]; //instaitate


        //TODO: No sure if you can do it one line for Multi-Dimenisional


        System.out.println(doubleNumbers[1][0]);


        /**
         * ArrayList, similar to Array but the length can be dynamic.  No  need to set thet length
         */

        System.out.println("*******Test ArrayList");

        List<Integer> alist = new ArrayList<Integer>();

        alist.add(20);

        for(Integer value : alist)
            System.out.println(value);


        ArrayList<String> aListOfStrings;
        aListOfStrings = new ArrayList<String>(3);
        aListOfStrings.add("Erick");
        aListOfStrings.add("Guevara");
        aListOfStrings.add("Ivan");
        aListOfStrings.add("Flores");

        aListOfStrings.remove(0);

        if (aListOfStrings.contains("Ivan")) {

            System.out.println("I'm in Ivan");
        }

        System.out.println(aListOfStrings);


        /**
         * Tetsing the ArrayList Generics
         */

        ArrayList<String> listStrings = new ArrayList<>();
        listStrings.add("erick");

        System.out.println(listStrings);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(2,"erick");


        class JavaCourse {

            String courseName = "Java";
        }


        JavaCourse [] jc = {new JavaCourse(), new JavaCourse()};

        for (JavaCourse j: jc){
            System.out.println(j.courseName);
        }

        for (JavaCourse j: jc){
//            j = new JavaCourse();
            j.courseName = "aws";
        }

        for (JavaCourse j: jc){
            j = new JavaCourse();
//            j.courseName = "aws";
        }

        for (JavaCourse j: jc){
            System.out.println(j.courseName);
        }



        System.out.println(map);

        System.out.println("+++++++++++++++");

        String [] names = {"erick", "Ivan", "Guevara"};

        for (String theName : names) {
            theName = "newName";
        }

        for (String theName : names) {
            System.out.println(theName);
        }


        System.out.println("+++++++++ssds++++");



        
        List s1 = new ArrayList();
        
        s1.add(1);
        s1.add(3);
        
//        List s2 = s1;

        System.out.println(s1);





    }
}
