package part1;
// Make a program which creates a sort of truth table to show the behavior of all the logical operators

// mentioned.

// Hints: 
/* 
 * You need two Boolean type variables which you will initially set both to false
 *  Use character escape codes to tabulate the results
 */

public class LogicTable {

    public static void main(String[] args) {
        boolean p, q;
        // this prints the header of the table
        System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP");

        p = true;
        q = true;

        System.out.print(p + "\t" + q + "\t");

        System.out.print((p & q) + "\t" + (p | q) + "\t");

        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;

        System.out.print(p + "\t" + q + "\t");

        System.out.print((p & q) + "\t" + (p | q) + "\t");

        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;

        System.out.print(p + "\t" + q + "\t");

        System.out.print((p & q) + "\t" + (p | q) + "\t");

        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = false;

        System.out.print(p + "\t" + q + "\t");

        System.out.print((p & q) + "\t" + (p | q) + "\t");

        System.out.println((p ^ q) + "\t" + (!p));
    }

}
