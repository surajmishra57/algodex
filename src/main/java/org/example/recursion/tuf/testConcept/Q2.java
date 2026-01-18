package org.example.recursion.tuf.testConcept;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int target = 7;

        findAllSubSeqWithEqualSum(arr, target, 0, 0, new ArrayList<Integer>());
        int count = countAllSubSeqWithEqualSum(arr, target, 0, 0);
        System.out.println("count of subseq with sum " + count);
    }

    private static int countAllSubSeqWithEqualSum(int[] arr, int target, int index, int currSum) {
        if (index >= arr.length) {
            if (currSum == target)
                return 1;
            return 0;
        }
        return countAllSubSeqWithEqualSum(arr, target, index + 1, currSum + arr[index])
                + countAllSubSeqWithEqualSum(arr, target, index + 1, currSum);
    }

    private static void findAllSubSeqWithEqualSum(int[] arr, int target, int index, int currSUm, ArrayList<Integer> ds) {
        if (index >= arr.length) {
            if (currSUm == target) {
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr[index]);
        findAllSubSeqWithEqualSum(arr, target, index + 1, currSUm + arr[index], ds);
        ds.remove(ds.size() - 1);
        findAllSubSeqWithEqualSum(arr, target, index + 1, currSUm, ds);
    }

}
