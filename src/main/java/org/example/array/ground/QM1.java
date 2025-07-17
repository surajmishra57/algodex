package org.example.array.ground;

import java.util.Arrays;

/**
 * Product of Array Except Self
 * Last Updated : 13 Jan, 2025
 * Given an array arr[] of n integers, construct a product array res[] (of the same size) such that res[i] is equal to the product of all the elements of arr[] except arr[i].
 * <p>
 * Example:
 * <p>
 * Input: arr[] = [10, 3, 5, 6, 2]
 * Output: [180, 600, 360, 300, 900]
 * Explanation:
 * <p>
 * For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
 * For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
 * For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
 * For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
 * For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
 * Input: arr[] = [12, 0]
 * Output: [0, 12]
 * Explanation:
 * <p>
 * For i = 0, res[i] = 0.
 * For i = 1, res[i] = 12
 */
public class QM1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 5, 6, 2};
        for (int x : findProductOfArrayExceptSelf(arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] findProductOfArrayExceptSelf(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.fill(res, 0);
        int index = -1, zeors = 0, product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeors++;
                index = i;
            } else {
                product *= arr[i];
            }
        }
        if (zeors == 0) {
            for (int i = 0; i < res.length; i++) {
                res[i] = product / arr[i];
            }
        } else if (zeors == 1) {
            arr[index] = product;
        }
        return res;
    }
}
