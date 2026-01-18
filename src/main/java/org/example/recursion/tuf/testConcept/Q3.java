package org.example.recursion.tuf.testConcept;

import java.util.ArrayList;

/**
 * Print all subsequnce equal to give sum any element a select infinite time
 */
public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 7,1};
        int target = 7;

        ArrayList<Integer> ds = new ArrayList<>();
        findAllSubSeqEqualToGivenSum(arr, target, 0, ds);
    }

    private static void findAllSubSeqEqualToGivenSum(int[] arr, int target, int index, ArrayList<Integer> ds) {
        if (index >= arr.length) {
            if (target == 0) {
                System.out.println(ds);
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findAllSubSeqEqualToGivenSum(arr, target - arr[index], index, ds);
            ds.remove(ds.size() - 1);
        }
        findAllSubSeqEqualToGivenSum(arr, target, index + 1, ds);
    }
}
