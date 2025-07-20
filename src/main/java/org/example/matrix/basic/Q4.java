package org.example.matrix.basic;

/**
 * Search element in a sorted matrix
 * Last Updated : 20 Dec, 2024
 * Given a sorted matrix mat[][] of size nxm and an element x, the task is to find if x is present in the matrix or not. Matrix is sorted in a way such that all elements in a row are sorted in increasing order and for row i, where 1 <= i <= n-1, the first element of row i is greater than or equal to the last element of row i-1.
 * <p>
 * Examples:
 * <p>
 * Input: x = 14, mat[][] = [[ 1,  5,  9],
 * [14, 20, 21],
 * [30, 34, 43]]
 * Output: true
 * <p>
 * Input: x = 42, mat[][] = [[ 1,  5,  9,  11],
 * [14, 20, 21, 26],
 * [30, 34, 43, 50]]
 * Output: false
 */
public class Q4 {
    public static void main(String[] args) {
        int x = 14, mat[][] = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        System.out.println(findingElementInMatrixUsingBinarySearch(x, mat));
    }

    private static boolean findingElementInMatrixUsingBinarySearch(int x, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if (mat[row][col] == x)
                return true;
            else if (mat[row][col] < x)
                low = mid + 1;
            else
                high = mid - 1;

        }
        return false;
    }
}
