package org.example.array_revision;

import java.util.Arrays;

/**
 * Product of Array Except Self
 * Last Updated : 23 Jul, 2025
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
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 3, 5, 6, 2};

        for (var i : productOfSubArrayExceptSelf(nums)) {
            System.out.print(i + " ");
        }
    }

    private static int[] productOfSubArrayExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 0);
        int zeros = 0, index = -1, product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
                index = i;
            } else {
                product *= nums[i];
            }
        }
        if (zeros == 1) {
            res[index] = product;
        } else if (zeros == 0) {
            for (int i = 0; i < nums.length; i++) {
                res[i] = product / nums[i];
            }
        }

        return res;
    }
}
