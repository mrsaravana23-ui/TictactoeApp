import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        Random rand = new Random();

        // Game state variables
        char humanSymbol;
        char computerSymbol;
        boolean isHumanTurn;

        // Toss: 0 or 1
        int toss = rand.nextInt(2);

        if (toss == 0) {
            // Human starts
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';

            System.out.println("Toss Result: You start first!");
        } else {
            // Computer starts
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';

            System.out.println("Toss Result: Computer starts first!");
        }

        // Display assigned symbols
        System.out.println("Your Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);

        // Show current turn
        if (isHumanTurn) {
            System.out.println("Current Turn: Human");
        } else {
            System.out.println("Current Turn: Computer");
        }
    }
}
