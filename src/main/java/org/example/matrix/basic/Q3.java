package org.example.matrix.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Sort the given matrix
 * Last Updated : 22 Oct, 2024
 * Given a m x n matrix. The problem is to sort the given matrix in strict order.
 * Here strict order means that the matrix is sorted in a way such that all elements in a row are sorted in increasing order and for row ‘i’,
 * where 1 <= i <= m-1, the first element is greater than or equal to the last element of row 'i-1'.
 * <p>
 * <p>
 * Input : mat[][] = { {5, 4, 7},
 * {1, 3, 8},
 * {2, 9, 6} }
 * Output : 1 2 3
 * 4 5 6
 * 7 8 9
 * <p>
 * Input: mat[][] = {{5, 4, 7},
 * {1, 3, 8} }
 * Output: 1 3 4
 * 5 7 8
 */
public class Q3 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        sortMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sortMatrix(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res.add(mat[i][j]);
            }
        }
        Collections.sort(res);
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = res.get(count++);
            }
        }
    }
}
