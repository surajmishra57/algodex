package org.example.array.easy;

import java.util.Arrays;

/**
 * Segregate 0s and 1s in an array
 * Last Updated : 09 Jul, 2025
 * You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once.
 * <p>
 * Input :  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
 * Output :  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 * <p>
 * Input :  [0, 1, 0]
 * Output :  [0, 0, 1]
 * <p>
 * Input :  [1, 1]
 * Output :  [1, 1]
 * <p>
 * Input :  [0]
 * Output :  [0]
 */
public class Q11 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
//        usingSortingApproch(arr);
        usingTwoPointerTech(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void usingTwoPointerTech(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0)
                left++;
            else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
                left++;
            }
        }
    }

    private static void usingSortingApproch(int[] arr) {
        Arrays.sort(arr);
    }
}
