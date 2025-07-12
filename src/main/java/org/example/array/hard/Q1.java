package org.example.array.hard;

/**
 * Surpasser Count of Each Element in Array
 * Last Updated : 25 Nov, 2024
 * Given an array of distinct integers arr[], the task is to find the surpasser count for each element of the array.
 * <p>
 * A surpasser of an element in an array is any element to its right that is greater than it, i.e., arr[j] is a surpasser of arr[i] if i < j and arr[i] < arr[j]. The surpasser count of an element is the number of surpassers.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [2, 7, 5, 3, 8, 1]
 * Output: [4, 1, 1, 1, 0, 0]
 * Explanation:
 * <p>
 * For 2, there are 4 greater elements to its right: [7, 5, 3, 8]
 * For 7, there is 1 greater element to its right: [8]
 * For 5, there is 1 greater element to its right: [8]
 * For 3, there is 1 greater element to its right: [8]
 * For 8, there is no greater element to its right: [0]
 * For 1, there is no greater element to its right: [0]
 * Input: arr[] = [4, 5, 1]
 * Output: [1, 0, 0]
 * Explanation:
 * <p>
 * For 4, there is 1 greater element to its right: [5]
 * For 5, there is no greater element to its right: [0]
 * For 1, there is no greater element to its right: [0]
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 5, 3, 8, 1};
        for (var x : findSurpasser(arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] findSurpasser(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            temp[i] = count;
        }
        return temp;
    }
}
