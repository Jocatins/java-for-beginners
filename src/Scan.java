import java.util.*;

//read an integer and return it to user
class Scan {

    // public static void main(String[] args) {

    // // creating instance
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number: ");

    // // read an integer
    // int x = sc.nextInt();
    // System.out.println("Number: " + x);
    // }
}

// Using the scanner to capture text (string variable) from keyboard:

class Alpha {

    public static void main(String[] args) {
        // declare Vars

        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        // ... Read input one word at a time.
        System.out.println("Enter words. End with EOF (CTRL-Z \r\n" + "then Enter) ");

        // ... Read input one word at a time, adding it to an array list, hasNext to
        // read more than one word

        while (in.hasNext()) {
            words.add(in.next());
        }

        // ... Sort the words.
        Collections.sort(words);

        // ... Print the sorted list.

        System.out.println("\n\nSorted words \n");
        for (String word : words) {
            System.out.println(word);
        }
    }
}