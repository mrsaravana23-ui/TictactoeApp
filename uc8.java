import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    // Function to print board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Check if move is valid
    public static boolean isValidMove(int row, int col) {
        return board[row][col] == ' ';
    }

    // Player move
    public static void playerMove() {
        int pos;
        while (true) {
            System.out.print("Enter position (1-9): ");
            pos = sc.nextInt();

            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;

            if (pos >= 1 && pos <= 9 && isValidMove(row, col)) {
                board[row][col] = 'X';
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Computer random move (UC7)
    public static void computerMove() {
        int row, col;
        while (true) {
            int pos = rand.nextInt(9) + 1;
            row = (pos - 1) / 3;
            col = (pos - 1) % 3;

            if (isValidMove(row, col)) {
                board[row][col] = 'O';
                System.out.println("Computer chose position: " + pos);
                break;
            }
        }
    }

    // UC9: Check win
    public static boolean checkWin(char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) return true;
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                board[1][j] == player &&
                board[2][j] == player) return true;
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) return true;

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) return true;

        return false;
    }

    // Check draw
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    // 🔥 UC8: Game Loop
    public static void gameLoop() {

        boolean gameOver = false;

        while (!gameOver) {

            printBoard();

            // Player Turn
            playerMove();
            if (checkWin('X')) {
                printBoard();
                System.out.println("Player wins!");
                gameOver = true;
                break;
            }

            if (isDraw()) {
                printBoard();
                System.out.println("Game is a draw!");
                break;
            }

            // Computer Turn
            computerMove();
            if (checkWin('O')) {
                printBoard();
                System.out.println("Computer wins!");
                gameOver = true;
                break;
            }

            if (isDraw()) {
                printBoard();
                System.out.println("Game is a draw!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        gameLoop();
    }
}
