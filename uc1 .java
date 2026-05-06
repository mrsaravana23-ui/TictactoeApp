public class TicTacToe {

    public static void main(String[] args) {

        // Create a 3x3 board
        char[][] board = new char[3][3];

        // Initialize the board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Print the board
        printBoard(board);
    }

    // Method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line
        }
    }
}