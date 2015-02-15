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

#Enthuware Java Basics

* All non-static/instance methods in a class are implicitly passed a 'this' parameter when called.
* The keyword 'this' can only be used within non-static methods. static methods cannot access non static fields or methods.
* as soon as it is set to null, the object held by the reference is eligible for GC
---
* Note that if no argument is passed the args parameter is NOT null but a valid non-null String array of length zero.
* An instance member belongs to a single instance, not the class as a whole. An instance member is a member variable or a member method that belongs to a specific object instance. All non-static members are instance members.
* static blocks of code?
* A final variable must be initialized when an instance is constructed, or else the code will not compile. This can be done either in an instance initializer or in EVERY constructor.
  The keyword static is used to signify that a block is static initializer. If nothing is there before starting curly brace then it is an instance initializer.
---
* A non public class may exist in any file. This implies that there can be only one public class in a file.
* class main's main method will be executed. final is a valid modifier for the standard main method. 
* static and final are valid modifiers for both member field and method declarations within a class. 
transient and volatile modifiers are only valid for member field declarations. 
abstract and native are only valid for member methods.
* The order of the static and public keywords is irrelevant. But the return type should always come just before the method name.  
Applying final to the method does not change the method signature.
* 1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
  2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();
---
* The order of keywords for a static import must be "import static ... ". 
You can either import all the static members using import static java.lang.Integer.* 
or one specific member using import static java.lang.Integer.MAX_VALUE; 

You must specify the full package name of the class that you are importing (just like the regular import statement). 
So, import static Integer.*; is wrong.
* double x=10, double y;  //3 // 3 is invalid syntax. It can be written as either double x=10; double y;  or double x=10, y;
* static methods can't be abstract.

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
  
        

#Enthuware Working with Java Data Types
* Strings
    - substring (int number) - returns a new string of the substring
    - substring(int begin, int end) - begin is included, end is excluded.  returns a new string
    - indexOf(int ch) - returns the index of the first occurence of the ch found
    - indexOf(int ch, int fromIndex) - Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
    - indexOf(String str) - Returns the index within this string of the first occurrence of the specified substring.
* String class itself is final and so all of its methods are implicitly final.
* StringBuilder
    - append, insert, delete, substring, replace
* Values of type boolean cannot be converted to any other types.
* implicit narrowing and implicit widening
---
* So, if you have, Object o = null; System.out.println(o); will print null and will not throw a NullPointerException.
* Note that + operator is overloaded for String. So if you have a String as any operand for +, a new combined String will be created by concatenating the values of both the operands. Therefore, x+y will result in a String that concatenates integer x and String y.
* We have to explicitly initialize local variables other wise they remain uninitialized and it will be a compile time error if such variables are accessed without getting initialized.
---
* A byte can ALWAYS be assigned to an int.
* Range of byte is -128 to 127
* Observe that rounding is a standard mathematical procedure where the number that lies exactly between two numbers always rounds up to the higher one. 
So .5 rounds to 1 and -.5 rounds to 0.
        

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

#Enthuware  Using Operators and Decision Constructs
* The | operator, when applied for boolean operands, ensures that both the sides are evaluated. This is opposed to || which does not evaluate the Right Hand
* + is overloaded such that if any one of its two operands is a String then it will convert the other operand to a String and create a new string by concatenating the two.
* The left operand of instanceof MUST be an object and not a primitive.
* Any two integral primitives can be compared using == operator.
* Anything bigger than an int can NEVER be assigned to an int or anything smaller than int ( byte, char, or short) without explicit cast.
* operands of mathematical operators are ALWAYS promoted to AT LEAST int. (i.e. for byte * byte both bytes will be first promoted to int.) and the return value will be AT LEAST int.
*  double/float/long/boolean cannot be used in switch(...) statement.
* Since there is a case condition that matches the input string "c", that case statement will be executed directly. This prints "cat". Since there is no break after this case statement and the next case statement, the control will fall through the next one (which is default : ) and so "none" will be printed as well.
* long, float, double, and boolean can never be used as a switch variable.
* Only String, byte, char, short, int, and enum values can be used as types of a switch variable. (String is allowed since Java 7.)
* The switch variable must be big enough to hold all the case constants.
* All case labels should be COMPILE TIME CONSTANTS.
---
* boolean, long, float and double cannot be used for the case labels. Any integral type(i.e. int, char, byte, short), String, or enum can be used.
* No two of the case constant expressions associated with a switch statement may have the same value.
* || and && are short circuiting operation i.e. if the value of the expression can be known by just seeing the first part then the remaining part is not evaluated while | and & will always let all the parts evaluates
* throws an ArithmeticException because of division by 0, which is caught by the catch block.
* modulus It can be used on floating points operands also. For example, 5.5 % 3 = 2.5
* && and || operate only on booleans.
* & can have integral as well as boolean operands.
---
* Note that none of the parameters is a String so conversion to String will not happen. The following are the error messages given by the compiler.
* 3. Expand the += operator as: k = k + 3 + ++k; from (k += 3 + ++k;)
* Neither the switch expression nor the case labels can be of type boolean.
* Note that both equals() and hashCode() methods can be overridden by the programmer so you can't say anything about what they will return without looking at the code.
* Code 3 is invalid because a switch statement must have a body. The body may even be empty as shown in Code 4.
* All operands of type byte, char or short are promoted AT LEAST to an int before performing mathematical operations. 
If one of the operands is larger than an int then the other one is promoted to the same type. 
Note that System.out.println((float)5/4); will print 1.25. If you remove the explicit cast (float), it will print 1.
* x is an int and int is perfectly valid. long, double, boolean, and float are not valid.
* a += (a =4) is same as a = a + (a=4).
--
* Note that  boolean operators have more precedence than =. (In fact, = has least precedence of all operators.)
* This will not compile because a short VARIABLE can NEVER be assigned to a char without explicit casting. A short CONSTANT can be assigned to a char only if the value fits into a char.

  short s = 1; byte b = s; => this will also not compile because although value is small enough to be held by a byte but the Right Hand Side i.e. s is a variable and not a constant.
  final short s = 1; byte b = s; => This is fine because s is a constant and the value fits into a byte.
  final short s = 200; byte b = s; => This is invalid because although s is a constant but the value does not fit into a byte.

  Implicit narrowing occurs only for byte, char, short, and int. Remember that it does not occur for long, float, or double. So, this will not compile: int i = 129L;

* Note that the program ends with ExceptionInInitializerError because any exception thrown in a static block is wrapped into ExceptionInInitializerError and then that ExceptionInInitializerError is thrown.




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

#Enthuware Arrays
* It is named length and not size. ArrayList has a method named size() that returns the number of elements in the ArrayList. 
* Each dimension expression is fully evaluated before any part of any dimension expression to its right.

* All the elements of an array of primitives are automatically initialized by default values, which is 0 for numeric types and false for boolean.
  Therefore, ia[1] is 0.
* If the array reference expression produces null instead of a reference to an array, then a NullPointerException is thrown at runtime, but only after all parts of the array reference expression have been evaluated and only if these evaluations completed normally.
    - In other words, the embedded assignment of 2 to index occurs before the check for array reference produced by getArray().
* List.subList() Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the returned list is empty.)
* Difference between the placement of square brackets: 
int[] i, j; //here i and j are both array of integers. 
int i[], j; //here only i is an array of integers. j is just an integer.
* Neither an ArrayList nor an array is thread safe. If you have multiple threads trying to add and remove elements from an ArrayList or an array, you have to write additional code to ensure thread safety.
---
* Note that whenever you create an array all of its elements are automatically given defaults values. Numeric types are initialized to 0, objects are initialized to null, and booleans to false.
  
  So if you have, float[ ] f = new float[3]; f[0], f[1] and f[2] will all be 0.0.
  
* This is perfectly valid. You can have any number of comma separated statements in initialization and incrementation part. The condition part must contain a single expression that returns a boolean.
  All a for loop needs is two semi colons :-
  for( ; ; ) {} This is a valid for loop that never ends. A more concise form for the same is : for( ; ; );
  
  


* Section 5 Loop Constructs

#Enthuware Loop Constructs

* A break statement with no label attempts to transfer control to the innermost enclosing switch, while, do, or for statement;
* A continue statement with no label attempts to transfer control to the innermost enclosing while, do, or for statement;
* In no case can the control go beyond this statement in the for loop. Therefore,  rest of the statements in the for loop are unreachable and so the code will not compile.
---
* continue can be used only inside a 'for', 'while' or 'do while' loop.



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


#Enthuware Methods
* When the return type of the overridden method (i.e. the method in the base/super class) is a primitive, the return type of the overriding method (i.e. the method in the sub class) must match the return type of the overridden method.
* The overriding method cannot decrease the accessibility.
* private->'no modifier'->protected->public
* 'protected' means the method will be accessible to all the classes in the same package and all the subclasses
* No modifier (which is the default level) means the method will be accessible only to all the classes in the same package.

* First, static statements/blocks are called IN THE ORDER they are defined. 
Next, instance initializer statements/blocks are called IN THE ORDER they are defined. 
Finally, the constructor is called
* if method is abstract, so does the class need to be abstract. 
* All methods need a body {}, unless an abstract method.
* An abstract method cannot have a method body. {} constitutes a valid method body.
* If you declare a field to be final, it must be explicitly initialized by the time the creation of an object of the class is complete. So you can either initialize it immediately:
private final double ANGLE = 0;
or you can initialize it in the constructor or an instance block.
* The file will not compile because TC is a top level class and private is not a valid access modifier for a top level class. private and protected can be applied to an inner class. 
A top level class (i.e. a class not defined inside any other class) can only be public or have default access.
---
*  A constructor cannot be final, static or abstract.



* Section 7 Working with Inheritance Part 1
    - Inheritance using the super and this keywords
    - ##Always use the most generic reference type possible ie
        + ElectroncDevice dev = new Television();
    - When a subclass constructor does not explicitly call a super class constructor the compiler inserts an implicit call to the super class no-arg constructor
        + if the super class does not have a no-arg constructor you will get a compile-time erorr
* Secdtin 7 Abstract Clases Part2
    - an abstrcct class can not be instainated
    - can also use the superclass as the reference object.
* Section 7 Polymorphism, Interfaces Part 3

#Enthuware Section 7 Working with Inheritance
* Every field declaration in the body of an interface is implicitly public, static and final. 
It is permitted, but strongly discouraged as a matter of style, to redundantly specify any or all of these modifiers for such fields. 
A constant declaration in an interface must not include any of the modifiers synchronized, transient or volatile, or a compile-time error occurs.
* Constructor must declare all the checked exceptions declared in the base constructor (or the super classes of the checked exceptions). 
They may add other exception. 
This behavior is exactly opposite from that of methods. 
The overriding method cannot throw any exception other than overridden method. It may throw subclasses of those exceptions.
* This is valid because a list of no exception is a valid subset of a list of exceptions thrown by the superclass method.
* You cannot access c.i because i is private in B. 
But you can access ( (A)c).i because i is public in A. 
Remember that member variables are shadowed and not overridden. 
So, B's i shadows A's i and since B's i is private, you can't access A's i unless you cast the reference to A. 
You cannot access c.j because j is private in A.
* Only methods that are inherited can be overridden and private methods are not inherited.
* Only the methods that are not declared to be final can be overridden. 
Further, private methods are not inherited so they cannot be overridden either.
* A method can be overridden by defining a method with the same signature(i.e. name and parameter list) 
and return type as the method in a superclass. 
The return type can also be a subclass of the orginal method's return type.
* An overriding method cannot exhibit behavior that contradicts the declaration of the original method. 
An overriding method therefore cannot return a different type (except a subtype) or throw a wider spectrum of exceptions than the original method in the superclass.
* Overriding method only needs to specify a subset of the list of exception classes the overridden method can throw. A set of no classes is a valid subset of that list.
---
* The point to understand here is, b is declared to be a reference of class Base and methodB() is not defined in Base. 
So the compiler cannot accept the statement b.methodB() because it only verifies the validity of a call by looking at the declared class of the reference. 
For example, the compiler is able to verify that b.methodA() is a valid call because class Base has method methodA. 
But it does not "bind" the call. Call binding is done at runtime by the jvm and the jvm looks for the actual class of object referenced by the variable before invoking the method.
* An overriding method can be made less restrictive than the overridden method. The restrictiveness of access modifiers is as follows:
  private>default>protected>public (where private is most restrictive and public is least restrictive).

  Note that there is no modifier named default. The absence of any access modifiers implies default access.
* By default all the methods of an interface are public and abstract so there is no need to explicitly specify the "abstract" keyword for the draw() method if you make Shape an interface. 
But it is not wrong to do so.
---
* Classes do not extend interfaces, they implement interfaces.
* Interfaces do not implement anything, they can extend multiple interfaces.
* The getValue(int i) method of class B in option c, is different than the method defined in the interface because their parameters are different. 
Therefore, this class does not actually implement the method of the interface and that is why it needs to be declared abstract.
* It will not compile because the class of reference s is Speak, which does not have the method up().
* Since the constructor of Bird is private, the subclass cannot access it and therefore, 
it needs to be made public. protected or default access is also valid.
* Return type may also be a subclass/subinterface. 
So it can also return SortedSet, TreeSet, HashSet, or any other class that implements or subclasses a Set.
* Since the original (overridden) method does not have any throws clause, the overriding method cannot declare any checked exceptions.
* A method can throw any RuntimeException (such as a NullPointerException) even without declaring it in its throws clause.
* As a rule, fields defined in an interface are public, static, and final. (The methods are public and abstract.)

Here, the interface IInt defines 'thevalue' and thus any class that implements this interface inherits this field. 
Therefore, it can be accessed using s.thevalue or just 'thevalue' inside the class. 
Also, since it is static, it can also be accessed using IInt.thevalue or Sample.thevalue.
* Note that when a method returns objects (as opposed to primitives, 
like in this question), the principle of covariant returns applies. 
Meaning, the overriding method is allowed to return a subclass of the return type defined in the overridden method. 
Thus, if a base class's method is: public A m(); then a subclass is free to override it with: public A1 m(); if A1 extends A.



* Section 8 Handling Exception - Part 1
    - Use of Exceptions in Java
        + When using java libraries that rely on external resources, the compiler will require you to handle or declare the exceptions that might occur
            * Handling an exceptions means add code in the code block
            * Declare that the method may fail to execute successfully
        + Throwable is a special type of Java object
            * Error
            * Exception
                - Order is important.  You must catch the most specific exception first(that is, child classes before parent classes ie. fileNotFoundException is a child of IOException)
                - ###New to Java 7SE.  Try-with-resoucres statement is being used only to close resources.
                    + Automatically puts a finally statment to whatever resources you put in the resouce statement. IE
                    + try (InputStream in = new FileInputStream("a.text"))

#Enthuware Handling Exception
* A method that throws a 'checked' exception i.e. an exception that is not a subclass of Error or RuntimeException, either must declare it in throws clause or put the code that throws the exception in a try/catch block.
* You are throwing an exception and there is no try or catch block, or a throws clause. So it will not compile.
* The Exception that is thrown in the last, is the Exception that is thrown by the method to the caller.
  So, when no exception or any exception is thrown at line 1, the control goes to finally or some catch block. Now, even if the catch blocks throws some exception, the control goes to finally. The finally block throws CloneNotSupportedException, so the method ends up throwing CloneNotSupportedException. Other exceptions thrown by the code prior to this point are lost.
* You can only throw a Throwable using a throws clause. Exception and Error are two main subclasses of Throwable.
* A subclass of Error cannot be caught using a catch block for Exception because java.lang.Error does not extend java.lang.Exception. 
---
* SecurityException extends RuntimeException: Usually thrown by the JVM.  
It is thrown by the security manager upon security violation. 
For example, when a java program runs in a sandbox (such as an applet) and it tries to use prohibited APIs such as File I/O, the security manager throws this exception.
---
* Any exception that extends java.lang.Exception but is not a subclass of java.lang.RuntimeException is a checked exception.
* You can use Throwable as well as Exception as both of them are super classes of MyException. 
RuntimeException (and its subclasses such as NullPointerException and ArrayIndexOutOfBoundsException) is not a checked exception. 
So it cannot cover for MyException which is a checked exception. 
You cannot use Error as well because it is not in the hierarchy of MyException, which is 
Object <- Throwable <- Exception <- MyException.
* java.lang.Exception is a checked Exception. 
**Which means, the method that throws this exception must declare it in the throws clause.**
Hence, yourMethod must declare throws Exception in its throws clause.  

Now, since the call to yourMethod in myMethod can also potentially throw an exception, myMethod must also declare it in its throws clause. 
By the same logic, main method should also declare it in its throws clause.
*1. Even if the program is executed without any arguments, the 'args' is NOT NULL. In such case it will be initialized to an array of Strings containing zero elements.
 2. The finally block is always executed, no matter how control leaves the try block. Only if, in a try or catch block, System.exit() is called then finally will not be executed.