// Utility class for conversion (Separation of Concerns)
class SlotConverter {

    // Method to convert slot to row & column
    public int[] convertToIndex(int slot) {

        // Convert to zero-based index
        int index = slot - 1;

        // Calculate row and column
        int row = index / 3;   // Division
        int col = index % 3;   // Modulo

        return new int[]{row, col};
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        SlotConverter converter = new SlotConverter();

        int slot = 5; // Example input (can come from UC3)

        int[] position = converter.convertToIndex(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}
