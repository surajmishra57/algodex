package org.example.array.basics;

import java.util.ArrayList;
import java.util.Collections;

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
 * <p>
 * Try it on GfG Practice
 */
public class Q6 {
    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        ArrayList<Integer> res = findLeaderUsingIteration(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> findLeaderUsingIteration(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int leader = arr[arr.length - 1];
        res.add(leader);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (leader < arr[i]) {
                res.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.sort(res);
        return res;
    }
}
