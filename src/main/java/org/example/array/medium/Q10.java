package org.example.array.medium;

import java.util.HashMap;

/**
 * https://www.geeksforgeeks.org/dsa/majority-element/
 * <p>
 * Majority Element
 * Last Updated : 26 Jun, 2025
 * Given an array arr[], return the element that appears more than n / 2 times, where n is the array size. If no such element exists, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
 * Output: 1
 * Explanation: Element 1 appears 4 times, which is more than
 * 7
 * 2
 * =
 * 3.5
 * 2
 * 7
 * ​
 * =3.5 so it is the majority element.
 * <p>
 * Input: arr[] = [7]
 * Output: 7
 * Explanation: Element 7 appears once in an array of  size 1, satisfying the condition
 * 1
 * >
 * 1
 * 2
 * 1>
 * 2
 * 1
 * ​
 * , so it is the majority element.
 * <p>
 * Input: arr[] = [2, 13]
 * Output: -1
 * Explanation: No element appears more than
 * 2
 * 2
 * =
 * 1
 * 2
 * 2
 * ​
 * =1 time, so there is no majority element.
 */
public class Q10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 1, 3, 5, 1};
        System.out.println(findMajorityElementUsingNestedLoop(arr));
        System.out.println(findMajorityElementUsingHashMap(arr));
        System.out.println(mooresVotingAlgo(arr));
    }

    private static int mooresVotingAlgo(int[] arr) {
        int count = 0, candidate = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate)
                count++;
        }
        if (arr.length / 2 <= count)
            return candidate;
        else
            return -1;
    }

    private static int findMajorityElementUsingHashMap(int[] arr) {
        int num = arr.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (var x : map.entrySet()) {
            if (x.getValue() > num)
                return x.getKey();
        }
        return -1;
    }

    private static int findMajorityElementUsingNestedLoop(int[] arr) {
        int num = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count >= num)
                return arr[i];
        }
        return -1;
    }
}
