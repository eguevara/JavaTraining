### Java Basics
* Part 19 Static (and Final)
    - class variables not instance variables used against the Class
    - Math.PI
    - Final prevents change of a variable.
* Part 20 StringBuilder
    - Strings are immutable.. Once you create a String, you can not Change it!
    - So.. String x = ""; x +="adding"; x="more";
    - actually creates three objects that x references.  This can be ineffieicent.
    - To resolve use StringBuilder.
    - StingBuilder is not thread-safe.  Use StringBuffe if you are using multi threads.
* Part 21 toString()
    - Consider using StringBuilder instead of string concat
* Part 22 Inheritance
* Part 23 Interfaces
* Part 38 Abstract Classes
* Part 26 Polymorphism
    - means many shapes
    - the type of the variable decides what methods you can call BUT when you go to the method you are going to the physical object that contains the code.
* Part 27 Encapsulation
    - public private protected
* Upcasting & Downcasting
    - Upcasting. up the class hierachy ie cameria is a machine.
    - Machine machine1 = new Machine();
    - Camera camera1 = new Camera(); -> Object reference is of Camera Type
    - //Upcasting
    - Machine machine2 = camerma1; -> upcasted.  machine2 now refers to Camera.
    - machine2.start() -> call the Camera method
    - //error: machine2.snap()
    - ###variable that decides what method you can call.
    - ###the type of the variable determines what methods.. but the object determine which type of implemenatioin you call (poly)
    - Downcasting
        + Machine machine3 = new Camera();
        + Camera camera2 = (Camera)machine3
        + camera2.snap();
* Generics
    - works with other class and you specify which objects to work with.
    - ##Classes that will return what ever type you paramertize <Type>
    - if you have a class that works with distinct objects.
    - ArrayList list = new ArrayList() vs ArrayList<String> = new ArrayList<String>();
    - ArrayList could be a parameritize class <Type>
    - with Java 7
        + ArrayList<Animal> someList = new ArrayList<>();
        + Java will infer what type using <>()
* Gererics and Wildcards
    - ArrayList<?>
    - for (Object value : list)
* Anonymous Classes
    - extending an existing class without subclassing the superclass.  Also implement an interface without creating an object
    - IE.
        + Interface interface = new Interface() { //anonymous method; }
        + interface.method
###what is or|equals !=

* Exceptions
* Inner(nested) classes - 43
    - only one public top level class in the file
    - none static inner class (nested)
        + class Brain {}
        + logically grouping
        + ##used when access to the instance variable of outer class is needed.
    - static inner class
        + public static class Battery() {}
        + can not access instance varialbes outside class only static
        + used normal class that is not assoicated to instance variables used for outer class
        + Robot.Battery bat1 = new Robot.Battery();
    - class inside a method
        + can access instance variables
        + can only access local variables if they are final, similar to automous class
        + can not make it public or private.. scoped to the method.
* Enum - 44
    - used for when you want variables to represent a fixed number of values.
    - only fixed values (in no order)
    - same as creating classes or interfaces.
    - In using switch, you use the reference variable and the case is the label
    - Animal animal = Animal.DOG;
    - they do not inheirt from object, part of java.lang.Enum package
    - Enum can have constructors and methods.
    - can also overwrite an enum.

### Java Collectins

* ArrayLists
    - Array that is expandable
    - ArrayList<Integer> = new ArrayList<Integer>();
    - No primitives allowed.
    - elements in ArrayList is size() (not .length)
    - .add(index_value)
    - using indexed for loop OR
    - use for()
    - .remove(index_value)
    - be careful with removing items from the front of the list since java will copy the rest of the list in memory.  
    - Works fast if your removing the last element since its just decrementing.
    - Can also use Inteface List as the reference object
        + List<Integer> = new ArrayList<Integer>();
* LinkedLists
    - compareing LinkedLists va ArrayList
    - basic rule.. is you only want to add and remove items from the end of the list use: *ArrayList*
    - else use *LinkedList* (remove from the front or middle)
    - adding to the end of the list, its pretty fast use *ArrayList*
    - adding to the begining, middle use *LinkedList*
    - LinkedList uses links to the front and end which is easier to change the pointer.