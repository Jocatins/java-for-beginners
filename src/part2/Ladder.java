package part2;
// IF, SWITCH and FOR LOOPS

// *********** IF-ELSE LOOPS *********************

class Ladder {
    Ladder() {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("x is one \t" + x);
            } else if (x == 2)
                System.out.println("x is two\t" + x);
            else if (x == 3)
                System.out.println("x is three \t" + x);
            else if (x == 4)
                System.out.println("x is four\t" + x);
            else
                System.out.println("x is not between 1 and 4\t" + x);
        }
    }
}

// *************** TERNARY ****************************
class Ternary {

    Ternary() {

        int result;

        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;
            if (i != 0)
                System.out.println("100 / " + i + " is " + result);
        }
    }
}

// Alternative to the code block above
class Ternary2 {
    Ternary2() {
        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false)
                System.out.println("100/ " + i + " is " + 100 / i);
        }
    }
}

// ************** SWITCH CASE *************************
class SwitchDemo {
    SwitchDemo() {
        int i;
        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(i + " is Zero");
                    break;
                case 1:
                    System.out.println(i + " is One");
                    break;
                case 2:
                    System.out.println(i + " is Two");
                    break;
                case 3:
                    System.out.println(i + " is Three");
                    break;
                case 4:
                    System.out.println(i + " is Four");
                    break;
                default:
                    System.out.println(i + " is five ");
            }
        }
    }
}

// using a ‘for’ loop to print the square roots of the numbers between 1 and 99.
// (It also
// displays the rounding error present for each square root).

// Show square roots of 1 to 99 and the rounding error.

// ************************* FOR -LOOPS ***********************************

class SqrRoot {

    SqrRoot() {
        double num, sRoot, rErr;
        for (num = 1.0; num < 100.0; num++) {
            sRoot = Math.sqrt(num);
            System.out.println("The square root of " + num + " is : " + sRoot);

            // Calculate Rounding Error
            rErr = num - (sRoot * sRoot);
            System.out.println("Rounding Error is : " + rErr);
            System.out.println("-----------------------------");
        }
    }
}

// Using more than one variable in the same loop is possible:

// Use commas in a for statement.

class Comma {
    Comma() {
        int i, j;

        for (i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i and j: " + i + " " + j);

        }
    }
}

// Loop until an S is typed.

// class ForTest {
// public static void main(String args[])
// throws java.io.IOException {
// int i;
// System.out.println("Type 'S' to stop.");
// for (i = 0; (char) System.in.read() != 'S'; i++)
// System.out.println("Pass #" + i);
// }

// }

// Parts of the for can be empty.

class Empty {
    Empty() {
        int i;

        for (i = 0; i < 10;) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}

// Parts of the for can be empty.

class Empty1 {
    Empty1() {
        int i;
        i = 0;
        for (; i < 10;) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}

// Loop without body.

class Empty2 {
    Empty2() {
        int i;

        int sum = 0;

        for (i = 1; i <= 5; sum += i++)
            System.out.println("Sum is " + sum);
    }
}

// Variables can be declared inside the loop itself but one must remember that
// in such case the
// variable exists only inside the loop!

// Declare loop variable inside the for.

class ForVar {
    ForVar() {
        int sum = 0;
        int fact = 1;
        // compute the factorial of the numbers through 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // i is known throughout the loop
            fact *= 1;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);

    }
}

// ***************** WHILE-LOOPS ***********************

// while (condition) statement;

// The loop will function only if the condition is
// true. If false it will move on to the next line of code.

class WhileDemo {
    WhileDemo() {
        char ch;
        // print the alphabet using a while loop
        ch = 'A';
        while (ch <= 'P') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}

// Compute integer powers of 2.
class Power {
    Power() {
        int e;

        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the power of " + i + " is "
                    + result);

        }
    }
}

// Do-while Loop

class DWDemo {

    public static void main(String args[])

            throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // get a char

        } while (ch != 'q');
    }

}
