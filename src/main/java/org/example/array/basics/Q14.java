package org.example.array.basics;

/**
 * Minimum cost to make array size 1 by removing larger of pairs
 * Last Updated : 07 Jul, 2025
 * Given an array of n integers. We need to reduce size of array to one. We are allowed to select a pair of integers and remove the larger one of these two. This decreases the array size by 1. Cost of this operation is equal to value of smallest one. Find out minimum sum of costs of operations needed to convert the array into a single element.
 * <p>
 * Examples:
 * <p>
 * Input: arr[]= [4 ,3 ,2 ]
 * Output: 4
 * Explanation: Choose (4, 2) so 4 is removed, new array = {2, 3}. Now choose (2, 3) so 3 is removed.  So total cost = 2 + 2 = 4.
 * <p>
 * Input: arr[]=[ 3, 4 ]
 * Output: 3
 * Explanation: choose (3, 4) so cost is 3.
 */
public class Q14 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2};
        System.out.println(minimumCostToMakeArraySize1(arr));
    }

    private static int minimumCostToMakeArraySize1(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return (arr.length - 1) * min;
    }
}
