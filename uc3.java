import java.util.Random;

import java.util.Scanner;

// Class to handle user input (Separation of Concerns)
class InputHandler {

    // Method to get slot input
    public int getSlotInput() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");

            // Check if input is integer
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                // Validate range
                if (slot >= 1 && slot <= 9) {
                    return slot; // return valid slot
                } else {
                    System.out.println("Invalid! Enter number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
            }
        }
    }
}

// Main game class
public class Main {

    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();

        // Control goes to input method and returns back
        int slot = inputHandler.getSlotInput();

        // Back to game logic
        System.out.println("You selected slot: " + slot);
    }
}
