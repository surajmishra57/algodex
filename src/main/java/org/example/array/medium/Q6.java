package org.example.array.medium;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/dsa/a-product-array-puzzle/#efficient-approach-using-product-array-on-time-and-o1-space
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
 * For i = 1, res[i] = 12.
 */
public class Q6 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 5, 6, 2};
        for (var x : productOfArrayExceptSelf(arr)) {
            System.out.print(x + " ");
        }
        System.out.println("_______________________");
        for (var x : productOfArrayExceptSelfUsingProductMethod(arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] productOfArrayExceptSelfUsingProductMethod(int[] arr) {
        int index = 0, zeros = 0, product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == zeros) {
                index = i;
                zeros++;
            } else {
                product *= arr[i];
            }
        }
        int[] result = new int[arr.length];
        Arrays.fill(result, 0);
        if (zeros == 1) {
            result[index] = product;
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] = product / arr[i];
            }
        }
        return result;
    }

    private static int[] productOfArrayExceptSelf(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}
