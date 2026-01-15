package org.example.recursion.tuf;

import java.util.ArrayList;

public class Q2_Test_TargetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 4, 5, 3, 2};
        int targetSum = 10;
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSubSeqWithGivenTargetSum(arr, targetSum, 0, ds, 0);
    }

    private static void printAllSubSeqWithGivenTargetSum(int[] arr, int targetSum, int i, ArrayList<Integer> ds, int currSum) {
        if (i >= arr.length) {
            if (currSum == targetSum) {
                for (var data : ds) {
                    System.out.print(data + " ");
                }
                System.out.println();
            }
            return;
        }
        ds.add(arr[i]);
        printAllSubSeqWithGivenTargetSum(arr, targetSum, i + 1, ds, currSum + arr[i]);
        ds.remove(ds.size() - 1);
        printAllSubSeqWithGivenTargetSum(arr, targetSum, i + 1, ds, currSum);
    }
}
