package br.codehive.tictactoe;

public class TicTacToeGame {
    private char[][] board;
    private char currentPlayer;
    private boolean gameOver;

    public TicTacToeGame() {
        board = new char[3][3];
        initializeBoard();
        currentPlayer = 'X'; // 'X' starts
        gameOver = false;
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-'; // Represents an empty cell
            }
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Attempts to make a move.
     * @param row The row (0-2)
     * @param col The column (0-2)
     * @return true if the move was valid and made, false otherwise.
     */
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-' || gameOver) {
            return false; // Invalid move
        }

        board[row][col] = currentPlayer;

        if (checkWin()) {
            gameOver = true;
        } else if (checkDraw()) {
            gameOver = true;
        } else {
            switchPlayer();
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // Still empty cells, not a draw yet
                }
            }
        }
        return true; // All cells filled, and no win -> draw
    }

    public char getWinner() {
        if (checkWin()) {
            // After a win, the currentPlayer has already switched,
            // so the winner is the *previous* player.
            return (currentPlayer == 'X') ? 'O' : 'X';
        }
        return '-'; // No winner yet or it's a draw
    }

    // Optional: for debugging or console output
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void resetGame() {
        initializeBoard();
        currentPlayer = 'X';
        gameOver = false;
    }
}
