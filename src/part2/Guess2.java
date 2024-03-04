package part2;

public class Guess2 {

    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K' | 'k'; // Declare variables 'ch' and 'answer', initialize 'answer' to 'K'

        do { // Start a do-while loop, continues until the user guesses the correct letter
             // Prompt the user to guess a letter
            System.out.println("I am thinking of a letter between A and Z");
            System.out.print("Can you guess it: ");

            // Read a character from the user, skipping newlines

            do {
                ch = (char) System.in.read(); // Read a character from the console input
            } while (ch == '\n' | ch == '\r'); // Continue until a non-newline character is entered

            // Compare the guessed letter with the correct answer
            if (answer == ch)
                System.out.println("*** Right***"); // Print a success message if the guess is correct
            else {
                System.out.print(".... Sorry, you're");
                // Print whether the guess is too high or too low compared to the correct answer
                if (ch < answer)
                    System.out.println("too low");
                else
                    System.out.println("too high");
                System.out.println("try again!! \n "); // Prompt the user to try again
            }
        } while (answer != ch); // Continue the loop until the correct letter is guessed

    }

}
