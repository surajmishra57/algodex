package org.example.array_revision;

/**
 * Reorder an array according to given indexes
 * Last Updated : 23 Jul, 2025
 * Given two integer arrays of the same length, arr[] and index[], the task is to reorder the elements in arr[] such that after reordering, each element from arr[i] moves to the position index[i]. The new arrangement reflects the values being placed at their target indices, as described by index[] array.
 * <p>
 * Example:
 * <p>
 * Input: arr[] = [10, 11, 12], index[] = [1, 0, 2]
 * Output: 11 10 12
 * Explanation: 10 moves to position 1, 11 to 0, and 12 stays at 2.
 * <p>
 * Input: arr[] = [1, 2, 3, 4], index[] = [3, 2, 0, 1]
 * Output: 3 4 2 1
 * Explanation: 1 moves to 3, 2 to 2, 3 to 0, 4 to 1.
 * <p>
 * Input: arr[] = [50, 40, 70, 60, 90], index[] = [3,  0,  4,  1,  2]
 * Output: 40 60 90 50 70
 */
public class ReorderdArrayByGivenIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{50, 40, 70, 60, 90};
        int[] index = new int[]{3, 0, 4, 1, 2};
        reorderByGivneIndex(arr, index);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reorderByGivneIndex(int[] arr, int[] index) {
        int i = 0;
        while (i < index.length) {
            if (i == index[i])
                i++;
            else {
                int tempIndex = index[index[i]];
                int tempValue = arr[index[i]];

                index[index[i]] = index[i];
                arr[index[i]] = arr[i];

                index[i] = tempIndex;
                arr[i] = tempValue;


            }
        }
    }
}
