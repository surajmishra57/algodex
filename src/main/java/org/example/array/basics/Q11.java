package org.example.array.basics;

/**
 * How to implement rotations in an array?
 * There are several ways to implement array rotations. Some of the approaches are mentioned below. Here we are considering right rotation. The movements will be just the opposite for left rotation.
 * <p>
 * Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
 * Output: {5, 6, 1, 2, 3, 4}
 * Explanation: After first right rotation, arr[] becomes {6, 1, 2, 3, 4, 5} and after the second rotation, arr[] becomes {5, 6, 1, 2, 3, 4}
 * <p>
 * Input: arr[] = {1, 2, 3}, d = 4
 * Output: {3, 1, 2}
 * Explanation: The array is rotated as follows:
 * <p>
 * After first left rotation, arr[] = {3, 1, 2}
 * After second left rotation, arr[] = {2, 3, 1}
 * After third left rotation, arr[] = {1, 2, 3}
 * After fourth left rotation, arr[] = {3, 1, 2}
 */
public class Q11 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//        clockWiseRotationArray(arr);
        antiClockWiseRotationArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void antiClockWiseRotationArray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }


    private static void clockWiseRotationArray(int[] arr) {
        for (int d = 1; d <= 10; d++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
        }
    }

}
