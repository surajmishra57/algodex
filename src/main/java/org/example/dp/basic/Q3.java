package org.example.dp.basic;

import java.util.Arrays;

/**
 * Lucas Numbers
 * Last Updated : 29 Oct, 2024
 * Lucas numbers are similar to Fibonacci numbers. Lucas numbers are also defined as the sum of its two immediately previous terms. But here the first two terms are 2 and 1 whereas in Fibonacci numbers the first two terms are 0 and 1 respectively.
 * Mathematically, Lucas Numbers may be defined as:
 * L
 * n
 * :
 * =
 * {
 * 2
 * if
 * n
 * =
 * 0
 * ;
 * 1
 * if
 * n
 * =
 * 1
 * ;
 * L
 * n
 * −
 * 1
 * +
 * L
 * n
 * −
 * 2
 * if
 * n
 * >
 * 1.
 * <p>
 * L
 * n
 * ​
 * :=
 * ⎩
 * ⎨
 * ⎧
 * ​
 * <p>
 * 2
 * 1
 * L
 * n−1
 * ​
 * +L
 * n−2
 * ​
 * <p>
 * ​
 * <p>
 * if n=0;
 * if n=1;
 * if n>1.
 * ​
 * <p>
 * The Lucas numbers are in the following integer sequence:
 * 2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123 ..............
 * Write a function int lucas(int n) n as an argument and returns the nth Lucas number.
 * Examples :
 * <p>
 * Input : 3
 * Output : 4
 * <p>
 * Input : 7
 * Output : 29
 */
public class Q3 {
    public static void main(String[] args) {

        System.out.println(findLucasNumberUsingRecu(7));
        int[] memo = new int[8];
        Arrays.fill(memo, -1);
        System.out.println(findLucasNumberUsingMemo(7, memo));
        System.out.println(findLucasNumberUsingTabul(7));
    }

    private static int findLucasNumberUsingMemo(int i, int[] memo) {
        if (i == 0)
            return 2;
        if (i == 1)
            return 1;
        if (memo[i] != -1)
            return memo[i];
        memo[i] = findLucasNumberUsingMemo(i - 2, memo) + findLucasNumberUsingMemo(i - 1, memo);
        return memo[i];
    }

    private static int findLucasNumberUsingTabul(int i) {
        int[] dp = new int[i + 1];
        dp[0] = 2;
        dp[1] = 1;
        for (int j = 2; j <= i; j++) {
            dp[j] = dp[j - 2] + dp[j - 1];
        }
        return dp[i];
    }

    private static int findLucasNumberUsingRecu(int i) {
        if (i == 0)
            return 2;
        if (i == 1)
            return 1;

        return findLucasNumberUsingRecu(i - 1) + findLucasNumberUsingRecu(i - 2);
    }
}
