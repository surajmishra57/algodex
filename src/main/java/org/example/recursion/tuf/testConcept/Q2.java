package org.example.recursion.tuf.testConcept;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int target = 7;

        findAllSubSeqWithEqualSum(arr, target, 0, 0, new ArrayList<Integer>());
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
