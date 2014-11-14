###Section 1

* 1.2 Java Basics Part 
    - One or more class, interface or enum definiations, only one of which may be public
    - The name of the file must be the same as the public
    - blocks are defined with in braces {}
    - nested unamed code blocks
    - Documenation begining with /** and ending with */ 
        + can be processed by javadoc tool
        + may include tags like @author, @param, @return
        + generate full documentation for your class.
    - Naming for classes,  methods and variables are all the same
        + case sensitive
        + may not begin with a number
        + may contain letters, numbers, underscores _ and dollar signs $
        + Java keyworkds may not be used
    - Nameing class names
* Variable Scope 
    - variables declared in the initilation part of the for lookp are accessible throughtout the loop's code block
* public static void main(String [] args)

## 1.3 Java Basics Part 2

* public static void main(String[] args)
    - args are parameters of the program
    - running an application
    - command line parameters are space separated
* Package basics  (review)
    - look at them as folders to group class with a common purpose
    - also helps control access
    - the default access is called "package-private" means that you anything else in the same package
    - protected access modifier allows access from the same package or any sub-classes in a different package
    - general to specific
    - reverse
* Importing Packages
    - classes in java.lang are imported implicitiy
    - import specific classes by fully-qualified name
    - beware of name collisions

## 1.4 Java Basics Part 3

* Summary
    - At start up time, first launch the class, the static initializer block get executed first.
    - main method executes to call the no-arugment constructor
    - the anonymous code block, outside anything else in the class is a prefix to each constructor would be excuetued next (before the code insdide the constructor)

## Section 2

* 2.1 Working with Java Data Types Part1
    - primitive types
        + Logical type (boolean)
            * either true/false, can not cast
        + Textual type (char)
            * 16 bits
        + Integral type (byte, short, int, long)
            * byte 8 bits -> 2^7 to 2^7 - 1
            * short 16 bits
            * int 32 bits (default type for integral literal) 123_456_789
            * long 64 bits
        + Floating point types (float, double)
            * float 32 bits - 99F
            * double 64 bits (default type for floating point)
        + be careful bears shouldn't ingest large furry dogs
    - Declaring and Initializing Variables
        + local varialbes must be initlaized
* 2.1 Working with Java Data Types Part2
    - variable initializtion
    - instance varaibles are initialized by default
    - default values are 0, false, or null depending on type ie. 
        + boolean -> false, byte -> 0, short -> 0, int -> 0, long -> 0L, char-> \u0000, float-> 0.0f, double ->0.0d, Object (Integer, String)->null
    - method or temporary variable must be initializee before use (compiler error)
    - primitives vs reference variables
    - memory areas in the jvm
        + stack holds local variables and paritial results and plays a part in the method invoication and return
        + the heap is the runtime data area where all class instances and array are stored.
        + primitive local variables store an actual value in the stack
        + reference variables store a reference to an object on the heap
    - reference type vs object type
        + Shirt myShirt = new Shirt();
        + the refrenece type is the left hand side
        + the object type is the reference type is Shirt (the type of the reference variable)
        + the object type is also Shirt, the type of the acutal object on the heap
        + two types: one for the reference variable on the stack and one for the object on heap * 
        + Assigning a reference to another reference ie. myShirt = yourShirt
    - the heap is managed automatically
    - You don't control the jvm's garabe collector
    - you can suggest that the jvm expent effort toward recycling unused object using the System.gc()
    - **** need to practice how many objects are open to gc using New and assigning objects to references
* 2.1 Working with Java Data Types Part3
* 2.1 Working with Java Data Types Part4
    - Write some StringBuilder code to practice StringBuilder *****
    - Create and Manipulate Strings, StringBuilder and StringBuffers
        + the value of String cano not be changed (immutable)
        + substring (index) always start in 0
    - StringBuilder and StringBuffer (mutable) sequeuence of characters that you can change
    - preferred when doing string manipulation
    - more efficient than just concatenating strings, + wider methods
    - difference is conncurrency
        + StringBuilder is not thread-safe, meaning you should'nt use it in a multi-threaded application.
        + StringBuffer is thread-safe, can be used in a mutli-threaded application and data will be safe.
    - Key methods for stringBuilder and StringBuffer are
        + append
        + insert
* 3.1 Using Operators and Decision Constructs
    - Operators
        + The value on the right is assigned to the identifier on theh left
        + The expression on the right is always evualted before the assignement
        + byte, char and short values are promoted to int before the operations
        + if either arugment is of the long type, then the other is also promotoed to long and the result is of the long type.
        + IE   byte b1=1, b2=2, b3; b3 = b1+b2; //Error results is an int and b3 is btype.
    - Incrementing and decrementing values
        + var2 = ++var1; Prefix: Increment var1 first, then assign to var2;
        + var2 = var1++; Postfix: Assign to var2 first, then increment var1.
    - Logical Operators
        + short circuit evualation &&, || means if the value on the left evalutes, the right is NOT evualuated.
* 3.2 Using Operators and Decisions Contracts
    - Operator precedence, using parenthesis
    - == operators vs equal() method
        + the == operator tests for *identity*. it returns true if and only if two references refer to the same object on the heap
        + the equals() method is intended to test for *equality* - it should return true if two objects contain the same value in all of the their fields.
        + overwrite equals, typically includes tohash() and comparto()
* 3.3 Using Operators and Decisions Contructs
    - Just review the scope variables
* 3.4 Using Operators and Decisions Contructs
    - Switch
        + Integer primitive data types
        + enumerated types (enums)
        + The string class (as of Java se 7)
        + Wrapper classes for the primates types: Character, Byte, Short, Integer
        + Without the break statments, the execution falls through and executes each subsequent case clause including default.
* 4 Section 4
    - Introduction to Arrays, One-Dimensisoanl Arrays
        + Elements of a single type
        + fixed length after creation
        + the index of the first eleient is zero
        + delcare, instainct and intialize
            * type [] array_name = {valu1, vaue2};
        + an array is always an object on the heap
        + trying to reference an index greater than Array size
            * java.lang.ArrayIndexOutOfBoundsException: 6
        + remember that default values are initialized for you if not declared
    - Multi-dimensional Arrays, ArrayList, Sample Question.
        + type [] [] array_identifityer;
        + type array_identifier [] [];
        + In java a multi-dimensional array is really an array of arrays **
        + array_identifier = new type [number_of_arrays][length];
        + Instantiates a 2d array: 5 arrays of 4 elements each
            * yearlySales = new int[5][4];
    - ArrayList Class
        + do not need to specify size when instantiate
        + add(), get(), remove(), indexOf()
        + a collection classes in Java
        + can only store objects, not primities.
        + in the java.util package
        + contains() returns true if the list contains a element
        + get() returns the elemient at the specified position
        + indexOf() returns the index of the first occurence of a value
        + set() Replaces the elment at a specified position
        + toArray() Returns an array with the same elements OR convert an arrayList to an Array
        + sample question
            * ArrayList does not change the order therfore, ArrayList.sort() would not compile as it is not a valid method.
* Section 6 Part 1: Method Basics, Method with Arugments and Return Values, Appy Static Keyword to metohd and Fields
    - [modifers] return_type method_idenfity([arguments])
        + Method_code_block
    - static makes the variable as *part of the class* not instance
* Section 6 Part 2: Overloaded Methods
    - a method is overlaoded when there are mulitiple versions of it in the same class.
    - they will take different parameters and might have different return tyes
    - done to make the class more flexible
    - Constructors
        + if there are no explicit constructors, the java compiler supplies a default no-arugment constructor
        + if there are one or more explicit constructes, no default constrctor will be supplied.
        + Good practice to have a no argument constructor
* Section 6 Part 3: Create and Overload Constructors, Apply Access Modiers
* Section 6 Part 4:  Apply Encapsulation to a Class
* Section 6 Part 5: Passing Primitive values vs reference values.
    - ##When a primitive or object referenece value is paaed to a method, *a copy of the value is generated*
    - ##when an object reference is passed to a method, the object *is not copied but the pointer to the object is copied*
* Section 7 Working with Inheirtence Part 1
    - Inheritance using the super and this keywords
    - ##Always use the most generic reference type possible ie
        + ElectroncDevice dev = new Television();
    - When a subclass construcor does not explicitly call a super class constructor the compiler inserts an implicit call to the super class no-arg constructor
        + if the super class does not have a no-arg constructor you will get a compile-time erorr
* Secdtin 7 Abstract Clases Part2
    - an abstrcct class can not be instainated
    - can also use the superclass as the reference object.
* Section 7 Polymorphism, Interfaces Part 3
* Section 8 Handling Exception - Part 1
    - Use of Exceptions in Java
        + When using java libaries that rely on external resources, the compiler will require you to handle or declare the exceptions that might occur
            * Handling an exceptions means add code in the code block
            * Delcare that the method may fail to execute successfully
        + Throwable is a special type of Java object
            * Error
            * Exception
                - Order is important.  You must catch the most specific exception first(that is, child classes before parent classes ie. fileNotFoundException is a child of IOException)
                - ###New to Java 7SE.  Try-with-resoucres statement is being used only to close resources.
                    + Automatically puts a finally statment to whatever resources you put in the resouce statement. IE
                    + try (InputStream in = new FileInputStream("a.text"))

