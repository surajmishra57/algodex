package org.example.matrix.basic;

/**
 * Traverse a given Matrix using Recursion
 * Last Updated : 12 Jul, 2025
 * Given a matrix mat[][] of size n x m, the task is to traverse this matrix using recursion.
 * Examples:
 * <p>
 * Input: mat[][] = [[1, 2, 3],
 * [4, 5, 6],
 * [7, 8, 9]]
 * Output: 1 2 3 4 5 6 7 8 9
 * <p>
 * Input: mat[][] = [[11, 12, 13],
 * [14, 15, 16],
 * [17, 18, 19]]
 * Output: 11 12 13 14 15 16 17 18 19
 * <p>
 * Approach:
 * <p>
 * Check If the current position is in the bottom-right corner of the matrix
 * Print the value at that position
 * End the recursion
 * Print the value at the current position
 * Check If the end of the current row has not been reached
 * Move right
 * Check If the end of the current column has been reached
 * Move down to the next row
 */
public class Q5 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        traverseMatrixUsingRecursion(arr, 0, 0);
    }

    private static void traverseMatrixUsingRecursion(int[][] arr, int i, int j) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            System.out.println(arr[i][j]);
            return;
        }
        System.out.print(arr[i][j] + " ");
        if (j < arr[0].length - 1) {
            traverseMatrixUsingRecursion(arr, i, j + 1);
        } else if (i < arr.length - 1) {
            traverseMatrixUsingRecursion(arr, i + 1, 0);
        }
    }
}
