package part1;
//Write a program which accepts three integers and working the average:

import java.util.Scanner;
import javax.swing.*;

public class KeyboardInput {

    KeyboardInput() {

        // ... Initialize Scanner to read from the console

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:\t");

        int a = input.nextInt(); // Read an integer from user input

        System.out.println("Enter second number:\t");

        int b = input.nextInt();

        System.out.println("Enter Third number:\t");

        int c = input.nextInt();

        System.out.println("Average is " + (a + b + c) / 3);
    }

}

// Swing Components

class SwingInput {
    SwingInput() {
        String temp; // temporary storage for input.
        temp = JOptionPane.showInputDialog(null, "First Number");

        int a = Integer.parseInt(temp); // String to integer
        temp = JOptionPane.showInputDialog(null, "Second Number");

        int b = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Third Number");

        int c = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, "Average is " + (a + b + c) / 3);
    }
}