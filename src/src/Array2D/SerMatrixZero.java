package Array2D;

public class SerMatrixZero {

    public static void setZeroes(int[][] matrix) {  // tc : o(m*n)  sc: o(m+n)

        int r = matrix.length;
        int c = matrix[0].length;
        boolean[] rows = new boolean[r];
        boolean[] cols = new boolean[c];

        // Step 1: Identify all rows and columns that need to be zeroed
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Set the identified rows to zero
        for (int i = 0; i < r; i++) {
            if (rows[i]) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set the identified columns to zero
        for (int j = 0; j < c; j++) {
            if (cols[j]) {
                for (int i = 0; i < r; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SerMatrixZero solution = new SerMatrixZero();

        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        solution.setZeroes(matrix1);
        printMatrix(matrix1);

        int[][] matrix2 = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        solution.setZeroes(matrix2);
        printMatrix(matrix2);
    }

    public void setZeroesOptimized(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Determine if the first row or first column has any zeros
        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        for (int j = 0; j < c; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Use first row and first column as markers
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out cells based on markers
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if needed
        if (firstRowHasZero) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out the first column if needed
        if (firstColHasZero) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

//    Initial Checks for First Row and Column:
//        We first check if the first row and first column contain any zeros. We use two boolean variables
//        (firstRowHasZero and firstColHasZero) to store this information.
//
//        Marking:
//        We then iterate through the rest of the matrix (starting from matrix[1][1]), and use the first
//        row and first column to mark rows and columns that should be zeroed out. If matrix[i][j] is zero,
//        we set matrix[i][0] and matrix[0][j] to zero.
//
//        Zeroing Based on Markers:
//        In another pass, we iterate through the matrix (excluding the first row and first column) and
//        set matrix[i][j] to zero if the corresponding marker in the first row or column is zero.
//
//        Zeroing the First Row and Column:
//        Finally, we zero out the first row and first column if the initial checks indicated they contained any zeros.

