package org.example.matrix.basic;

/**
 * Search in a Matrix or 2D Array
 * Last Updated : 30 Oct, 2024
 * Given a matrix mat[n][m] and an element target. return true if the target is present in the matrix, else return false.
 * <p>
 * Examples:
 * Input : mat[][] = { {10, 51, 9},
 * {14, 20, 21},
 * {30, 24, 43} }
 * target = 14
 * Output: Found
 * <p>
 * Input : mat[][] = {{31, 5, 9, 11},
 * {14, 7, 21, 26},
 * {30, 4, 43, 50} }
 * target = 42
 * Output: Not Found
 */
public class Q1 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{10, 51, 9}, {14, 20, 21}, {30, 24, 43}};
        int target = 14;
        System.out.println(findTargetInMatrix(mat, target));
    }

    private static boolean findTargetInMatrix(int[][] mat, int target) {
        int n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}
