package org.example.searching.hard;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/dsa/median-of-two-sorted-arrays/
 * <p>
 * Median of two sorted arrays of same size
 * Last Updated : 02 Jan, 2025
 * Given 2 sorted arrays a[] and b[], each of size n, the task is to find the median of the array obtained after merging a[] and b[].
 * <p>
 * Note: Since the size of the merged array will always be even, the median will be the average of the middle two numbers.
 * <p>
 * Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45]
 * Output: 16
 * Explanation: The merged sorted array is [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. The middle two elements are 15 and 17, so median = (15 + 17)/2 = 16
 * <p>
 * Input: a[] = [10], b[] = [21]
 * Output : 15.5
 * Explanation : The merged sorted array is [10, 21]. The middle two elements are 10 and 21, so median = (10 + 21)/2 = 15.5
 */
public class Q1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 12, 15, 26, 38};
        int[] b = new int[]{2, 13, 17, 30, 45};
        float result = usingSortingApprochForMedian(a, b);
        System.out.println(result);
    }

    private static float usingSortingApprochForMedian(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            arr[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[k++] = b[i];
        }
        Arrays.sort(arr);
        return (float) (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
    }
}
