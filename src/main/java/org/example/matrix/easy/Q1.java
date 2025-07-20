package org.example.matrix.easy;

/**
 * Check Sudoku solution is valid or not
 * Last Updated : 07 Oct, 2024
 * Given a solution of Sudoku puzzle,
 * the task is to check whether the given sudoku solution is valid or not.
 * A valid solution requires that each row, column, and 3×3 sub-matrix must contain the digits 1-9 without repetition.
 *
 *
 */
public class Q1 {
    public static void main(String[] args) {
        int[][] mat = {{7, 9, 2, 1, 5, 4, 3, 8, 6},
                {6, 4, 3, 8, 2, 7, 1, 5, 9},
                {8, 5, 1, 3, 9, 6, 7, 2, 4},
                {2, 6, 5, 9, 7, 3, 8, 4, 1},
                {4, 8, 9, 5, 6, 1, 2, 7, 3},
                {3, 1, 7, 4, 8, 2, 9, 6, 5},
                {1, 3, 6, 7, 4, 8, 5, 9, 2},
                {9, 7, 4, 2, 1, 5, 6, 3, 8},
                {5, 2, 8, 6, 3, 9, 4, 1, 7}};

        System.out.println(isValid(mat) ? "true" : "false");
    }

    static boolean isValid(int[][] mat) {

        // Arrays to track seen numbers in rows,
        // columns, and sub-matrix
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] subMat = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // Skip empty cells
                if (mat[i][j] == 0)
                    continue;

                int val = mat[i][j];
                int pos = 1 << (val - 1);

                // Check for duplicates in the current row
                if ((rows[i] & pos) > 0)
                    return false;
                rows[i] |= pos;

                // Check for duplicates in the current column
                if ((cols[j] & pos) > 0)
                    return false;
                cols[j] |= pos;

                // Calculate the index for the 3x3 sub-matrix
                int idx = (i / 3) * 3 + j / 3;

                // Check for duplicates in the current sub-matrix
                if ((subMat[idx] & pos) > 0)
                    return false;
                subMat[idx] |= pos;
            }
        }
        return true;
    }
}
