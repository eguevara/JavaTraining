package com.eguevara.guava;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by erickguevara on 10/15/14.
 */
public class StringJoinerExample {


    public static void main(String[] args) {

        String delimiter = "|";
        List<String> stringList = Arrays.asList("erick", "ivan", "guevara", null, "flores");

        /**
         * Long way of joining elements into a string separated by a delimiter
         */
        StringBuilder sb = new StringBuilder();
        for(String s : stringList) {
//            if (s != null) {
                sb.append(s).append(delimiter);
//            }
        }
        sb.setLength(sb.length() - delimiter.length());

        System.out.println(sb.toString());

        /**
         * Using the Joiner Class from Guava
         */

        System.out.println(Joiner.on("|").skipNulls().join(stringList));

        System.out.println(Joiner.on("|").useForNull("missing").join(stringList));

        Joiner stringJoiner = Joiner.on("|").useForNull("not here");
        System.out.println(stringJoiner.join(stringList));

        /**
         * Using Joiner Class from Guava with StringBuilder
         */

        StringBuilder sb2 = new StringBuilder();
        Joiner joiner = Joiner.on("**").skipNulls();

        System.out.println(joiner.appendTo(sb2, stringList));






    }
}
