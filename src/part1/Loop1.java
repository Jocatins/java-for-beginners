package part1;

public class Loop1 {

    Loop1() {
        int a, b, c;
        a = 2;
        b = 3;
        c = a - b;

        if (c >= 0)
            System.out.println("c is a positive number");
        if (c < 0)
            System.out.println("c is a negative number");

        System.out.println();
        c = b - a;
        if (c >= 0)
            System.out.println("c is a positive number");
        if (c < 0)
            System.out.println("c is a negative number");
    }

}

class Loop2 {

    Loop2() {

        int count;

        for (count = 0; count < 5; count++)
            System.out.println("This is count: \t" + count);
        System.out.println("Done!!!");
    }

}

// Write a program which can be used to display a conversion table, e.g. Euros
// to Naria

// Hints:
/*
 * One variable is required
 * You need a loop
 */

class EuroConv {

    EuroConv() {
        double eu;
        System.out.println("Euro conversion Table:");
        System.out.println();
        for (eu = 1; eu < 21; eu++)
            System.out.println(eu + " Euro is equivalent to N" + (eu * 1900));
    }
}