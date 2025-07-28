package org.example.prefix_sum.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Split an array into two equal Sum subarrays
 * Last Updated : 11 Jul, 2022
 * Given an array of integers greater than zero, find if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the two subarrays is the same. Print the two subarrays.
 * <p>
 * Examples :
 * <p>
 * Input : Arr[] = { 1 , 2 , 3 , 4 , 5 , 5  }
 * Output :  { 1 2 3 4 }
 * { 5 , 5 }
 * <p>
 * Input : Arr[] = { 4, 1, 2, 3 }
 * Output : {4 1}
 * {2 3}
 * <p>
 * Input : Arr[] = { 4, 3, 2, 1}
 * Output : Not Possible
 * Asked In : Facebook interview
 * <p>
 * A Simple solution is to run two loop to split array and check it is possible to split array into two parts such that sum of first_part equal to sum of second_part.
 * <p>
 * Below is the implementation of above idea.
 */
public class Q3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 5};
        System.out.println(splitArrayIntoTwoEqualSumSubarray(nums));
        System.out.println(splitArrayIntoTwoEqualSumSubarrayUsingEffectic(nums));
    }

    private static List<List<Integer>> splitArrayIntoTwoEqualSumSubarrayUsingEffectic(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            leftSum -= nums[i];
            rightSum += nums[i];
            if (leftSum == rightSum) {
                List<Integer> firstList = new ArrayList<>();
                List<Integer> secondList = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    firstList.add(nums[j]);
                }
                for (int j = i; j < nums.length; j++) {
                    secondList.add(nums[j]);
                }
                res.add(firstList);
                res.add(secondList);
            }
        }
        return res;
    }

    private static List<List<Integer>> splitArrayIntoTwoEqualSumSubarray(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j <= i; j++) {
                leftSum += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }


            if (leftSum == rightSum) {
                List<Integer> firstList = new ArrayList<>();
                List<Integer> secondList = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    firstList.add(nums[j]);
                }
                for (int j = i + 1; j < nums.length; j++) {
                    secondList.add(nums[j]);
                }
                res.add(firstList);
                res.add(secondList);
            }
        }
        return res;
    }
}
