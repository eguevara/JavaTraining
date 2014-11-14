package com.eguevara.sandbox;

/**
 * Created by erickguevara on 11/9/14.
 */

class Person {

    void call() {
        System.out.println("Person call");
    }

}

class Employee extends Person {

    void call() {
        System.out.println("Employee call");
    }
}


public class DefautConstructor {


    public static void main(String[] args) {

        Person person = new Employee();
        person.call();

    }


}
