package org.example.dp.basic;

import java.util.Arrays;

/**
 * Tribonacci Numbers
 * Last Updated : 13 Nov, 2024
 * The tribonacci series is a generalization of the Fibonacci sequence where each term is the sum of the three preceding terms.
 * <p>
 * a(n) = a(n-1) + a(n-2) + a(n-3)
 * with
 * a(0) = a(1) = 0, a(2) = 1.
 * <p>
 * First few numbers in the Tribonacci Sequence are 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, ....
 * <p>
 * Given a value n, task is to print first n Tribonacci Numbers.
 * Examples:
 * <p>
 * Input : 5
 * Output : 0, 0, 1, 1, 2
 * <p>
 * Input : 10
 * Output : 0, 0, 1, 1, 2, 4, 7, 13, 24, 44
 * <p>
 * Input : 20
 * Output : 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136,  5768, 10609, 19513
 * <p>
 * Try it on
 */
public class Q2 {
    public static void main(String[] args) {
        System.out.println(findTribonacci(5));
        int[] memo = new int[6];
        Arrays.fill(memo, -1);
        System.out.println(findTribonacciUsingMemorization(5, memo));
        System.out.println(findTribonacciUsingTabulrization(5));
    }

    private static int findTribonacciUsingTabulrization(int n) {
        int[] db = new int[n + 1];
        db[0] = 0;
        db[1] = 0;
        db[2] = 1;
        for (int i = 3; i < n; i++) {
            db[i] = db[i - 1] + db[i - 2] + db[i - 3];
        }
        return db[n];

    }

    private static int findTribonacciUsingMemorization(int n, int[] memo) {
        if (n == 0 || n == 1 || n == 2)
            return 0;
        if (n == 3)
            return 1;
        if (memo[n] != -1)
            return memo[n];

        memo[n] = findTribonacciUsingMemorization(n - 1, memo) + findTribonacciUsingMemorization(n - 2, memo) + findTribonacciUsingMemorization(n - 3, memo);
        return memo[n];
    }

    private static int findTribonacci(int n) {
        if (n == 0 || n == 1 || n == 2)
            return 0;
        if (n == 3)
            return 1;

        return findTribonacci(n - 1) + findTribonacci(n - 2) + findTribonacci(n - 3);
    }
}
