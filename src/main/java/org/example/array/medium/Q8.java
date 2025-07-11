package org.example.array.medium;

/**
 * https://www.geeksforgeeks.org/find-the-first-missing-number/
 * Find the smallest missing number
 * Last Updated : 03 Jul, 2023
 * Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array.
 * <p>
 * Examples:
 * <p>
 * Input: {0, 1, 2, 6, 9}, n = 5, m = 10
 * Output: 3
 * <p>
 * Input: {4, 5, 10, 11}, n = 4, m = 12
 * Output: 0
 * <p>
 * Input: {0, 1, 2, 3}, n = 4, m = 5
 * Output: 4
 * <p>
 * Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
 * Output: 8
 */
public class Q8 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 10};
        int n = 9, m = 11;
        System.out.println(findSmallestMissingNumberUsingVector(arr, n, m));
        System.out.println("-----------------------------------------------");
        System.out.println(findSmallestMissingNumberUsingBinarySearch(arr, 0, arr.length - 1));
    }

    private static int findSmallestMissingNumberUsingBinarySearch(int[] arr, int start, int end) {
        if (start > end)
            return end + 1;
        if (arr[start] != start)
            return start;
        int mid = (start + end) / 2;
        if (arr[mid] == mid)
            return findSmallestMissingNumberUsingBinarySearch(arr, mid + 1, end);
        return findSmallestMissingNumberUsingBinarySearch(arr, start, mid);

    }

    private static int findSmallestMissingNumberUsingVector(int[] arr, int n, int m) {
        int[] temp = new int[m];
        for (int a = 0; a < arr.length; a++) {
            temp[arr[a]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0)
                return i;
        }
        return -1;
    }
}
