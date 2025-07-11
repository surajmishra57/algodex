package org.example.array.easy;

/**
 * Stable Binary Sort
 * Last Updated : 09 Nov, 2024
 * Given an array arr[] of integers, the task is to partition the array based on even and odd elements. The partition has to be stable, meaning the relative ordering of all even elements must remain the same before and after partitioning, and the same should hold true for all odd elements.
 * <p>
 * Note: For a binary array (containing only 0s and 1s), this partition process is equivalent to sorting the array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 0, 1, 1, 0, 0]
 * Output: [0 ,0 ,0, 1, 1, 1]
 * Explanation: All even numbers came before the odd numbers.
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5]
 * Output: [2, 4, 1, 3, 5]
 * Explanation: All even numbers [2, 4] came before the odd numbers [1, 3, 5], and the relative ordering was also same.
 * <p>
 * Input: arr[] = [-5, -2, 0, 4, 7, 9]
 * Output: [-2, 0, 4, -5, 7, 9]
 * Explanation: All even numbers [-2, 0, 4] came before the odd numbers [-5, 7, 9], and the relative ordering was also same.
 */
public class Q12 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        stableSortUsingExteraSpace(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void stableSortUsingExteraSpace(int[] arr) {
        int res[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}
