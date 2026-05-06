public class TicTacToeValidator {

    // Method to validate the move
    public static boolean isValidMove(int row, int col, char[][] board) {

        // Boundary checking
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Row and column must be between 0 and 2.");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell is already occupied.");
            return false;
        }

        return true; // Move is valid
    }

    // Demo usage
    public static void main(String[] args) {

        // Initialize empty board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(row, col, board)) {
            board[row][col] = 'X';
            System.out.println("Move accepted!");
        } else {
            System.out.println("Move rejected!");
        }
    }
}
