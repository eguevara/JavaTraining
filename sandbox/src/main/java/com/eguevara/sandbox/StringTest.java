package com.eguevara.sandbox;

/**
 * Created by erickguevara on 11/3/14.
 */
public class StringTest {

    public static void main(String[] args) {
        String newString = "Erick";

        System.out.println(newString.charAt(2));

        System.out.println(newString.substring(0,2).startsWith("E"));

        String s = null;

        s += "guevara";
        System.out.println(s);

        String string1 = "erick";
        String string2 = "erickd";

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        System.out.println(!(string1.equals(string2)));


        String string3 = new String("ivan");
        String string4 = new String("ivan");

        System.out.println(string3 == string4);
        System.out.println(string3.equals(string4));



    }
}
