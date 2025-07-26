package org.example.array_revision;

/**
 * Given an array arr[] of size n, find the element that appears more than ⌊n/2⌋ times. If no such element exists, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
 * Output: 1
 * Explanation: Element 1 appears 4 times. Since ⌊7/2⌋ = 3, and 4 > 3, it is the majority element.
 * <p>
 * Input: arr[] = [7]
 * Output: 7
 * Explanation: Element 7 appears once. Since ⌊1/2⌋ = 0, and 1 > 0, it is the majority element.
 * <p>
 * Input: arr[] = [2, 13]
 * Output: -1
 * Explanation: No element appears more than ⌊2/2⌋ = 1 time, so there is no majority element.
 */
public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 13};
        System.out.println(majorityElementsUsingMoorisVotingAlgo(arr));
    }

    private static int majorityElementsUsingMoorisVotingAlgo(int[] arr) {
        int element = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count = 1;
            }
            if (arr[i] == element)
                count++;
            else
                count--;
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i])
                count++;
        }
        if (count > arr.length / 2)
            return element;
        return -1;
    }
}
