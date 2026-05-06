
import java.util.Random;

public void computerMove(char symbol) {
    Random rand = new Random();
    int row, col;

    while (true) {
        // Generate random slot (1–9)
        int slot = rand.nextInt(9) + 1;

        // Convert slot to row & column
        row = (slot - 1) / 3;
        col = (slot - 1) % 3;

        // Try placing move using UC6 logic
        if (placeMove(row, col, symbol)) {
            System.out.println("Computer placed at position: " + slot);
            break; // exit loop when valid move is placed
        }
    }
}
