package org.example.array.ground;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
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
public class QM2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 3, 5, 2};
        System.out.println(findMajorityElementUsingMoorisVotingAlgo(arr));

        // using Stream
        System.out.println(Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > arr.length / 2)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1));
    }

    private static int findMajorityElementUsingMoorisVotingAlgo(int[] arr) {
        int count = 0, element = -1;
        for (int k : arr) {
            if (count == 0) {
                element = k;
                count = 1;
            }
            if (element == k)
                count++;
            else {
                count--;
            }
        }
        count = 0;
        for (int j : arr) {
            if (j == element)
                count++;

        }

        if (count > arr.length / 2)
            return element;
        return -1;
    }
}
