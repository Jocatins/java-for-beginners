// The Math Class

public class Lessons1 {

    Lessons1() {
        double x, y, z;

        x = 3;

        y = 4;

        z = Math.sqrt(x * x + y * y);
        System.out.println("Hypotenuse is " + z);
    }

}

// Scope and Lifetime of Variables
// how to avoid programming errors by taking care where to
// initialize variables depending on the scope.

class Scopes {
    Scopes() {
        int x;

        x = 10;

        if (x == 10) { // start new scope
            int y = 20; // known only to this block
            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here
        // x is still known here.
        System.out.println("x is " + x);
    }
}

class Scope {

    Scope() {

        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered

            System.out.println("y is: " + y); // this always prints -1

            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}

// Type Casting and Conversions

class Example1 {

    Example1() {

        long L;
        double D;
        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
}

class Example2 {

    Example2() {
        double x, y, j;

        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // Casting double to int

        j = (x / y);
        System.out.println("Integer outcome of x / y: " + i);
        System.out.println("Double outcome of x / y: " + j);

        i = 100;
        b = (byte) i;

        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X

        ch = (char) b;

        System.out.println("ch: " + ch);

    }
}

class Example3 {
    Example3() {
        byte b;

        int i;

        b = 10;

        i = b * b; // No Casting needed

        b = 10;

        b = (byte) (b * b); // Casting needed, as cannot assign int to byte

        System.out.println("i and b: " + i + " " + b);
    }
}