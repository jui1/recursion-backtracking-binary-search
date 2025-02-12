package backtraking;

public class Nqueenpb {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int solutions = ans(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int ans(boolean[][] board, int row) {
        // Base case: If we've placed queens in all rows, we have found a solution.
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        // Try placing a queen in each column of the current row.
        for (int col = 0; col < board.length; col++) {
            board[row][col] = true; // Try placing a queen.

            // Check if placing the queen is safe.
            if (isSafe(board, row, col)) {
                count += ans(board, row + 1); // Recurse to the next row.
            }

            // Backtrack: Remove the queen.
            board[row][col] = false;
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertically (up direction)
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false; // Another queen in the same column.
            }
        }

        // Check diagonal (top-left to bottom-right)
        for (int i = 1; i <= row; i++) {
            if (col - i >= 0 && board[row - i][col - i]) {
                return false; // Another queen in the diagonal.
            }
        }

        // Check diagonal (top-right to bottom-left)
        for (int i = 1; i <= row; i++) {
            if (col + i < board.length && board[row - i][col + i]) {
                return false; // Another queen in the diagonal.
            }
        }

        return true; // No conflict, safe to place a queen.
    }
}
