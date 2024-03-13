# Notes on my Learnings

Operator Description Example Description
++ Increment a++ a = a + 1 (adds one from a)
-- Decrement a-- a = a – 1 (subtract one from a)
+= Add and assign a+=2 a = a + 2
-= Subtract and assign a-=2 a = a – 2
_= Multiply and assign a_=3 a = a \* 3
/= Divide and assign a/=4 a = a / 4
%= Modulus and assign a%=5 a = a mod 5

The for Loop can be used for just one statement:
for(initialization; condition; iteration) statement;

Loops are structures used to make the program repeat one or many instructions for ‘n’ times as
specified in the declaration of the loop.

The for Loop can be used for just one statement:
for(initialization; condition; iteration) statement;
or to repeat a block of code:
for(initialization; condition; iteration)
{
statement sequence
}

A class is a sort of template which has attributes and methods. An object is an instance of a class,
e.g. Riccardo is an object of type Person.

Methods are the functions which a particular class possesses. These functions usually use the data
defined by the class itself

When a value is passed to a
method it is called an Argument, while the variable that receives the argument is the Parameter

The term overloading refers to the act of using the same method/constructor name in a class but
different parameter declarations. Method overloading is an example of Polymorphism.

In Java programming, overloading constructors is a technique used to allow an object to initialize
another. This makes coding more efficient.

Arrays in Java are different from arrays in other programming languages because they are
implemented as objects.

Stacks implement a Last In First Out system (LIFO).
Queues use a First In First Out order (FIFO).

Understanding the “public static void main(String args[])” line of code – FYI only
This line really represents a method call, main, having ‘args’ (a string array) as parameter. This array
stores command-line arguments (CLI arguments), which is any information which follows the
program name.

-   Vector and ArrayList

A vector can be defined simply as an Array which can ‘grow’. Nowadays it has been replaced by
ArrayList.

-   Code snippets used to remove items from an ArrayList:

arrayList.remove( i, object );
