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
---
* public StringBuilder(int capacity)
Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
* public void ensureCapacity(int minimumCapacity) on stringBuilder
  Ensures that the capacity is at least equal to the specified minimum.
* StringBuilder or String has not clear(), empty(), removeAll(), deleteAll()
* "343434".charAt(39). 
As per the API documentation for charAt, it throws IndexOutOfBoundsException 
if you pass an invalid value (that is, if the index argument is negative or not less than the length of this string).
* This will not compile because String is a final class and final classes cannot be extended. 
There are questions on this aspect in the exam and so you should remember that StringBuffer and StringBuilder are also final. 
All Primitive wrappers are also final (i.e. Boolean, Integer, Byte etc). java.lang.System is also final.
* Not all short values are valid char values, and neither are all char values valid short values, 
therefore compiler complains for both the lines 2 and 3. They will require an explicit cast.
* This is invalid because the floating point suffices f, F or d, D are used only when using decimal system or hexadecimal and not while using binary.
* A floating point number written in binary cannot use any suffix. But a floating point number written in decimal or hex can use the floating point suffices f, F, d, and D.
* This question tests your knowledge on the default values of uninitialized primitives and object references. 
booleans are initialized to false, numeric types to 0 and object references to null. 
Elements of arrays are initialized to the default values of their types. So, elements of a boolean array are initialized to false. int, char, float to 0 and Objects to null.

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
---
* Remember that the args array is never null. If the program is run without any arguments, args points to a String array of length 0. Therefore, hasParams will be true and it will print "has params".
* & and | do not short circuit the expression but && and || do.


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

#Enthuware Loop Constructs

* A break statement with no label attempts to transfer control to the innermost enclosing switch, while, do, or for statement;
* A continue statement with no label attempts to transfer control to the innermost enclosing while, do, or for statement;
* In no case can the control go beyond this statement in the for loop. Therefore,  rest of the statements in the for loop are unreachable and so the code will not compile.
---
* continue can be used only inside a 'for', 'while' or 'do while' loop.
---
* while (false) { x=3; } is a compile-time error because the statement x=3; 
is not reachable; Similarly, for( int i = 0; false; i++) x = 3; is also a compile time error because x= 3 is unreachable.  

In if(false){ x=3; }, although the body of the condition is unreachable, 
this is not an error because the JLS explicitly defines this as an exception to the rule. 
It allows this construct to support optimizations through the conditional compilation. 
For example,  if(DEBUG){ System.out.println("beginning task 1"); }   
Here, the DEBUG variable can be set to false in the code while generating the production version of the class file, 
which will allow the compiler to optimize the code by removing the whole if statement entirely from the class file.
* Cannot use an existing/predefined variable in the variable declaration part.
* final is the only modifier (excluding annotations) that is allowed here.


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
* In cases where multiple methods are applicable, the compiler always calls the most specific one. 
In this case, the third one is the most specific one. 
* The reason is quite simple, the most specific method depending upon the argument is called. 
Here, null can be passed to all the 3 methods but FileNotFoundException class is the subclass of IOException which in turn is the subclass of Object. 
So, FileNotFoundException class is the most specific class. 
So, this method is called. Had there been two most specific methods, 
it would not even compile as the compiler will not be able to determine which method to call.
* To allow a method to take variable arguments of a type, you must use the ... syntax: methodName( <type>... variableName); 
Remember that there can be only one vararg argument in a method. 
Further, the vararg argument must be the last argument. 
So this is invalid: stringProcessor( String... variableName, int age); 
but this is valid: stringProcessor(int age, String... variableName);


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
---
* Any field in an interface is implicitly public, static, and final, whether these keywords are specified or not.
* 1. The overriding method must have same return type in case of primitives (a subclass is allowed in case of classes)  
   
  2. The overriding method can throw a subset of the exception or subclass of the exceptions thrown by the overridden class. 
  Having no throws clause is also valid since an empty set is a valid subset. 


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
---
* A method declaring that it throws a certain exception class may throw instances of any subclass of that exception class.
* A NullPointerException will be thrown if the expression given to the throw statement results in a null pointer. 
