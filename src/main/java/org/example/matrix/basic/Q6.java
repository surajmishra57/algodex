package org.example.matrix.basic;

/**
 * Program to find transpose of a matrix
 * Last Updated : 28 Jun, 2025
 * Given a 2D matrix mat[][], the task is to compute its transpose. The transpose of a matrix is formed by converting all rows of mat[][] into columns and all columns into rows.
 * <p>
 * Example:
 * <p>
 * Input: [[7, 8],[9, 10],[11, 12]]
 * Output: [[7, 9, 11],[8, 10, 12]]
 * Explanation:  The output is the transpose of the input matrix, where each row becomes a column. This rearranges the data so that vertical patterns in the original matrix become horizontal in the result.
 * <p>
 * Input: [[1, 2],[3, 4]]
 * Output: [[1, 3],[2, 4]]
 * Explanation:  The output is the transpose of the input matrix, where each row becomes a column. This rearranges the data so that vertical patterns in the original matrix become horizontal in the result.
 */
public class Q6 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{7, 8}, {9, 10}, {11, 12}};
        int[][] res = new int[mat[0].length][mat.length];
        transposeOfMatrix(mat, res);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // For Square Matrix Effective Approach
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        trasnposeOfSquareMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void trasnposeOfSquareMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private static int[][] transposeOfMatrix(int[][] mat, int[][] res) {
        for (int i = 0; i < res[0].length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[j][i] = mat[i][j];
            }

        }
        return res;
    }
}
