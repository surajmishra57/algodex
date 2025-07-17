package org.example.array.ground;

/**
 * Leaders in an array
 * Last Updated : 17 Dec, 2024
 * Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.
 * <p>
 * Note: The rightmost element is always a leader.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [16, 17, 4, 3, 5, 2]
 * Output: [17 5 2]
 * Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 2]
 * Output: [5 2]
 * Explanation: 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
 */
public class QB3 {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        
    }
}
