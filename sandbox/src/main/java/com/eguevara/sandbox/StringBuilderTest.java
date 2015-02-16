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


        /**
         * When string builder encounters a string it treats the rest as string but the first as add
         *
         * sout: 12Sun45
         *
         * 1 2 S u n 4 5
         * 0 1 2 3 4 5 6
         *
         * delete(3,6)
         *
         * 12S5
         *
         * append
         *
         * 12S512S5
         */

        sb = null;
        sb = new StringBuilder(18 + 2 + "Sun" + 4 + 5); //2 0 S u n 4 5
        System.out.println(sb.append(sb.delete(3, 6)));

        sb = null;
        sb = new StringBuilder(10 + 3 + 'c');  //char is convert to int and used as capacity
        System.out.println(sb.capacity());
        System.out.println(sb.append("erickguevara"));


        /**
         * the method subSequence doesn’t modify the contents of a StringBuilder.
         *
         * reverse modifies the value of a StringBuilder by assigning to it the reverse representation of its value.
         */

        sb = null;
        sb = new StringBuilder("123456");
        sb.subSequence(2, 4); // 34  + does not change the string builder!


        sb.deleteCharAt(3); //12356 - deleteCharat is zero based
        sb.reverse(); // 65321;
        System.out.println(sb);


        String test = "erick";

        if (test.equals("Guevara")) {

            System.out.println("equals");
        }
        
        StringBuilder sba1 = new StringBuilder("erick");
        StringBuilder sba2 = new StringBuilder("guevara");

        System.out.println("====");

        sba1.insert(2, sba2.append('I') );

        System.out.println(sba1);
        
        
        String String = "ericks";
        


    }
}
