package org.example.recursion.tuf;

public class Q2_Test_TargetSumCount {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 4, 5, 3, 2};
        int targetSum = 10;
        System.out.println(countTargetSum(arr, targetSum, 0, 0));
    }

    private static int countTargetSum(int[] arr, int targetSum, int index, int currSum) {
        if (index >= arr.length) {
            if (targetSum == currSum)
                return 1;
            return 0;
        }
        return countTargetSum(arr, targetSum, index + 1, currSum + arr[index])
                + countTargetSum(arr, targetSum, index + 1, currSum);
    }
}
