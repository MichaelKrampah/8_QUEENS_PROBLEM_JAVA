package queens;

public class EightQueens {
    private static final int BOARD_SIZE = 8;
    int[] board;
    private boolean solutionFound;

    public boolean solveEightQueens() {
        board = new int[BOARD_SIZE];
        solutionFound = solveQueens(0);
        return solutionFound;
    }

    
    private int[] getRandomPermutation() {
        int[] permutation = new int[BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            permutation[i] = i;
        }

        // Shuffle the permutation array
        for (int i = BOARD_SIZE - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = permutation[i];
            permutation[i] = permutation[j];
            permutation[j] = temp;
        }

        return permutation;
    }
    
    
    private boolean solveQueens(int column) {
        if (column == BOARD_SIZE) {
            // All queens have been placed successfully
            return true;
        }

        int[] permutation = getRandomPermutation();
        for (int row : permutation) {
            if (isSafe(row, column)) {
                board[column] = row;

                if (solveQueens(column + 1)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isSafe(int row, int column) {
        // Check if a queen can be placed on board[row][column]

        // Check this row on the left side
        for (int i = 0; i < column; i++) {
            if (board[i] == row) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = 1; i <= row && i <= column; i++) {
            if (board[column - i] == row - i) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = 1; i <= column && row + i < BOARD_SIZE; i++) {
            if (board[column - i] == row + i) {
                return false;
            }
        }

        return true;
    }
}