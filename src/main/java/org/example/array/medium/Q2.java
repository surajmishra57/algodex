package org.example.array.medium;

/**
 * https://www.geeksforgeeks.org/dsa/sort-array-contain-1-n-values/
 * Sort an array which contain 1 to n values
 * Last Updated : 09 Oct, 2024
 * We are given an array that contains 1 to n elements, our task is to sort this array in an efficient way. We are not allowed to simply copy the numbers from 1 to n.
 * Examples :
 * <p>
 * Input : arr[] = {2, 1, 3};
 * Output : {1, 2, 3}
 * <p>
 * Input : arr[] = {2, 1, 4, 3};
 * Output : {1, 2, 3, 4}
 */
public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3};
        sortArrayInCorrectIndex(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sortArrayInCorrectIndex(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] == arr[correctIndex]) {
                i++;
            } else {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
