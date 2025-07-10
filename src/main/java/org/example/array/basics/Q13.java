package org.example.array.basics;

/**
 * Minimum increment by k operations to make all equal
 * Last Updated : 11 Oct, 2024
 * You are given an array of n-elements, you have to find the number of operations needed to make all elements of array equal. Where a single operation can increment an element by k. If it is not possible to make all elements equal print -1.
 * <p>
 * Example :
 * <p>
 * Input : arr[] = {4, 7, 19, 16},  k = 3
 * Output : 10
 * <p>
 * Input : arr[] = {4, 4, 4, 4}, k = 3
 * Output : 0
 * <p>
 * Input : arr[] = {4, 2, 6, 8}, k = 3
 * Output : -1
 */
public class Q13 {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 33, 9, 45, 63};
        int k = 6;
        int result = minIncrementToMakeAllEqual(arr, k);
        System.out.println(result);
    }

    private static int minIncrementToMakeAllEqual(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        for (int i = 0; i < arr.length; i++) {
            if ((max - arr[i]) % k != 0)
                return -1;
            else {
                res += (max - arr[i]) / k;
            }
        }
        return res;
    }
}
