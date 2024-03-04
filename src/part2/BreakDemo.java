package part2;
// Using Break to Terminate a Loop

class BreakDemo {
    BreakDemo() {

        int num;
        num = 100;

        for (int i = 0; i < num; i++) {
            if (i * i >= num)
                break; // terminate loop if i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Loop complete");
    }
}

// Termination via user intervention

class Break2 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        for (;;) {
            ch = (char) System.in.read(); // get a char
            if (ch == 'q')
                break;
        }
        System.out.println("Your pressed q");

    }
}

class Break3 {
    Break3() {

        for (int i = 0; i < 3; i++) {
            // Printing the current value of 'i' for the outer loop
            System.out.println("Outer loop count: " + i);
            // Printing a message indicating the start of inner loop
            System.out.print(" Inner loop count:");
            // Initializing a variable 't' for the inner loop
            int t = 0;
            // Inner loop continuing as long as 't' is less than 100
            while (t < 100) {
                // Checking if 't' is equal to 10
                if (t == 10)
                    // If true, breaking out of the inner loop
                    break;

                // Printing the value of 't' without a newline
                System.out.print(t + "");
                // Incrementing the value of 't'
                t++;
            }
            // Printing a newline after the inner loop completes
            System.out.println();
        }
        // Printing a message indicating that all loops have completed
        System.out.println("Loops complete");
    }
}

// In summary, this code demonstrates the usage of nested loops (for loop and
// while loop) along with the break statement to
// control the flow of execution within loops.
// The inner loop breaks when the value of t reaches 10,
// but the outer loop continues until it completes its three iterations.

// Terminating a loop with break and use labels to carry on execution

class Break4 {
    Break4() {
        int i;

        for (i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\ni is " + i);
                        if (i == 1)
                            break one;
                        if (i == 2)
                            break two;
                        if (i == 3)
                            break three;

                        System.out.println("This won't print");
                    }
                    System.out.println("After block three ");
                }
                System.out.println("after block two");
            }
            System.out.println("After block one");
        }
        // the following statement executes on termination of the for loop

        System.out.println("After for. Loop completed.");
    }
}

// The following code is another example using labels but this time the label
// marks a point outside the loop:

class Break5 {
    Break5() {

        done: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k);
                    if (k == 5)
                        break done;
                }
                System.out.println("After k loop");
            }
            System.out.println("After j loop");
        }
        System.out.println("After i loop");
    }
}

// The next example shows the difference in execution taking care to where one
// puts the label:

class Break6 {
    Break6() {
        int x = 0, y = 0;

        stop1: for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2)
                    break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        for (x = 0; x < 5; x++)
            stop2: {
                for (y = 0; y < 5; y++) {
                    if (y == 2)
                        break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}

// Use of Continue (complement of Break)

class ContDemo {
    ContDemo() {
        int i;
        for (i = 0; i < 10; i++) {
            if ((i % 2) != 0)
                continue;
            System.out.println(i + " is even number.");
        }
    }
}

// It is possible to use labels with the continue feature. It works the same as
// when we used it before in
// the break operation.

class ContToLabel {
    ContToLabel() {
        outerLoop: for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5)
                    continue outerLoop;
                System.out.print(j);
            }
        }
    }
}

// Nested Loops

class FindFac {

    FindFac() {

        for (int i = 2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0)
                    System.out.print(j + "j : ");
            System.out.println();
        }
    }
}