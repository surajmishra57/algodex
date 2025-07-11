package org.example.array.medium;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/dsa/find-number-of-triangles-possible/#naive-approach-checking-all-triplets-on3-time-and-o1-space
 * Count Possible Triangles
 * Last Updated : 28 Dec, 2024
 * Given an unsorted array of positive integers, the task is to find the number of triangles that can be formed with three different array elements as three sides of triangles.
 * <p>
 * For a triangle to be possible from 3 values as sides, the sum of the two values (or sides) must always be greater than the third value (or third side).
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [4, 6, 3, 7]
 * Output: 3
 * Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7].
 * Note that [3, 4, 7] is not a possible triangle.
 * <p>
 * Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
 * Output: 6
 * Explanation: There can be 6 possible triangles:
 * [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]
 * <p>
 * Input: arr[] = [1, 2, 3]
 * Output: 0
 * Examples: No triangles are possible.
 * <p>
 * Try it on GfG Practice
 */
public class Q11 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 21, 22, 100, 101, 200, 300};
        System.out.println(countHowManyTriangelCanBeFormedUsingNestedLoops(arr));
        System.out.println(countHowManyTriangelCanBeFormedUsingTowPointer(arr));
    }

    private static int countHowManyTriangelCanBeFormedUsingTowPointer(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }

    private static int countHowManyTriangelCanBeFormedUsingNestedLoops(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] > arr[k] &&
                            arr[i] + arr[k] > arr[j] &&
                            arr[k] + arr[j] > arr[i]) {
                        count++;
                    }
                }
            }

        }
        return count;
    }


}
