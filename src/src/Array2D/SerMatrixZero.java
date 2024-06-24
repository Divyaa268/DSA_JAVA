package Array2D;

public class SerMatrixZero {

    public static void setZeroes(int[][] matrix) {

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


        }
