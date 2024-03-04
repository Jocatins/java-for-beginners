package part2;

public class Guess1 {
    public static void main(String[] args)

            throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z");

        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // get a char

        if (ch == answer)
            System.out.println("Congratulations! You guessed correctly!");
        else {
            System.out.print("... Sorry you missed it\t :");

            if (ch < answer)
                System.out.println("too low");
            else
                System.out.println("too high");

        }
    }

}
