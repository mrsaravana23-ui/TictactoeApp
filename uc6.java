#include <iostream>
using namespace std;

class TicTacToe {
private:
    char board[3][3];

public:
    // Constructor to initialize board
    TicTacToe() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-'; // empty cell
            }
        }
    }

    // Display board
    void displayBoard() {
        cout << "\nBoard:\n";
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                cout << board[i][j] << " ";
            }
            cout << endl;
        }
    }

    // UC6: Place Move on Board
    bool placeMove(int row, int col, char symbol) {
        // Check valid index
        if(row < 0 || row >= 3 || col < 0 || col >= 3) {
            cout << "Invalid position!\n";
            return false;
        }

        // Check if cell is empty
        if(board[row][col] != '-') {
            cout << "Cell already occupied!\n";
            return false;
        }

        // Place symbol
        board[row][col] = symbol;
        return true;
    }
};
