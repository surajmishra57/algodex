package org.example.recursion.tuf;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Q2_PrintAllSubSequenceWithGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1};
        int sum = 0;
        int givenSum = 2;
        ArrayList<Integer> res = new ArrayList<>();
        findTheSubSequenceWithGivenSum(arr, 0, sum, res, givenSum);
    }

    private static void findTheSubSequenceWithGivenSum(int[] arr, int index, int sum, ArrayList<Integer> ds, int givenSum) {
        if (index >= arr.length) {
            if (sum == givenSum) {
                for (var data : ds) {
                    System.out.print(data + " ");
                }
                System.out.println();
            }
            return;
        }


        ds.add(arr[index]);
        findTheSubSequenceWithGivenSum(arr, index + 1, sum + arr[index], ds, givenSum);
        ds.remove(ds.size() - 1);
        findTheSubSequenceWithGivenSum(arr, index + 1, sum , ds, givenSum);
    }
}
