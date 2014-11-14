package com.eguevara.sandbox;

/**
 * Created by erickguevara on 10/15/14.
 */
public class StringBuilderTest {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(500);

        sb.append("Erick guevara\n");
        sb.append("Ivan Flores\n");

        sb.insert(2, "First item");


        System.out.println(sb.toString());

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1);



    }
}
