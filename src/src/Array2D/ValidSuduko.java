package Array2D;

public class ValidSuduko {

    public boolean isValidSudoku(char[][] board) {
        // Initialize arrays to keep track of seen digits in rows, columns, and boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        // Traverse through each cell in the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                // Skip empty cells
                if (num == '.') {
                    continue;
                }

                // Convert char digit to an integer index (1 -> 0, 2 -> 1, ..., 9 -> 8)
                int n = num - '1';

                // Calculate the index for the 3x3 sub-box
                int boxIndex = (i / 3) * 3 + j / 3;

                // Check if the digit has been seen before in the current row, column, or sub-box
                if (rows[i][n] || cols[j][n] || boxes[boxIndex][n]) {
                    return false; // If seen before, the board is not valid
                }

                // Mark the digit as seen in the current row, column, and sub-box
                rows[i][n] = true;
                cols[j][n] = true;
                boxes[boxIndex][n] = true;
            }
        }

        // If no conflicts are found, the board is valid
        return true;
    }

    public static void main(String[] args) {
        ValidSuduko solution = new ValidSuduko();

        char[][] board1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(solution.isValidSudoku(board1)); // Output: true
        System.out.println(solution.isValidSudoku(board2)); // Output: false
    }
}

//    In a 9x9 Sudoku board, there are nine 3x3 sub-boxes.
//    Each sub-box is identified by a unique index from 0 to 8.
//    We need to map each cell in the board to its corresponding sub-box index.
//
//        The board is divided into 3 rows and 3 columns of sub-boxes, so:
//
//        The top-left sub-box (0,0) to (2,2) is box 0.
//        The top-middle sub-box (0,3) to (2,5) is box 1.
//        The top-right sub-box (0,6) to (2,8) is box 2.
//        The middle-left sub-box (3,0) to (5,2) is box 3.
//        The middle-middle sub-box (3,3) to (5,5) is box 4.
//        The middle-right sub-box (3,6) to (5,8) is box 5.
//        The bottom-left sub-box (6,0) to (8,2) is box 6.
//        The bottom-middle sub-box (6,3) to (8,5) is box 7.
//        The bottom-right sub-box (6,6) to (8,8) is box 8.
