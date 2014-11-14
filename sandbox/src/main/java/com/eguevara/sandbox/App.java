package com.eguevara.sandbox;

/**
 * Hello world!
 *
 */


class PhoneNumber {
    String phoneNumber = "12345";

    void setNumber() {
        String phoneNumber;
        phoneNumber = "6789";
        System.out.println(phoneNumber);
    }

}

@Deprecated
class DeprecatedTest {

    public DeprecatedTest() {

        System.out.println("Deprecated Constructors");

    }
}

class Test {

    boolean booleanTest;
    byte byteTest;
    short shortTest;
    char charTest;
    int intTest;
    float floatTest;
    long longTest;
    double doubleTest;

    String classString;

    Test() {}

    @Override
    public String toString() {
        return super.toString();
    }
}

public class App
{

    public String classString;

    public static void main( String[] args )
    {


        DeprecatedTest dt = new DeprecatedTest();


        System.out.println( "Hello World Erick!" );

        Test testObject = new Test();
        System.out.println(
                "BooleanTest:" + testObject.booleanTest +
                        "ByteTest:" + testObject.byteTest +
                        "ShortTest:" + testObject.shortTest +
                        "CharTest:" + testObject.charTest +
                        "IntTest:" + testObject.intTest +
                        "FloatTest:" + testObject.floatTest +
                        "longTest:" + testObject.longTest +
                        "doubleTest:" + testObject.doubleTest
        );

        String test;
        System.out.println("String Default VAlue" + testObject.classString);


        //calling outer class method start, which instanitates an inner non-static class
        Car myCar = new Car();
        myCar.start();


        //Calling a static nested class.
        Car.FlauxCapacitor fc = new Car.FlauxCapacitor();
        fc.start();


        System.out.println("**********");

        PhoneNumber pn = new PhoneNumber();
        pn.setNumber();
        System.out.println(pn.phoneNumber);


        System.out.println("++++++++++++");
        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println((-30)*(-20));



    }
}



