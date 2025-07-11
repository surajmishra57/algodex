package org.example.array.easy;

/**
 * Equilibrium Index
 * Last Updated : 15 Jan, 2025
 * Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes.
 * <p>
 * Note: When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 0, 3]
 * Output: 2
 * Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
 * <p>
 * Input: arr[] = [1, 1, 1, 1]
 * Output: -1
 * Explanation: There is no equilibrium index in the array.
 * <p>
 * Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
 * Output: 3
 * Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
 */
public class Q11_New {
    public static void main(String[] args) {
        int[] arr = new int[]{-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndex(arr));
    }

    private static int findEquilibriumIndex(int[] arr) {
        for (int i = 1; i <= arr.length - 2; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
