package org.example.dp.basic;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(findFib(6));
        int[] memo = new int[6 + 1];
        Arrays.fill(memo, -1);
        System.out.println(findFibUsingMemorisation(6, memo));
        System.out.println(findFibUsingTabulariation(6));
    }

    private static int findFibUsingTabulariation(int i) {
        int[] tabul = new int[i + 1];
        tabul[0] = 0;
        tabul[1] = 1;
        for (int j = 2; j <= i; j++) {
            tabul[j] = tabul[j - 1] + tabul[j - 2];
        }
        return tabul[i];
    }

    private static int findFibUsingMemorisation(int i, int[] memo) {
        if (i <= 1)
            return i;
        if (memo[i] != -1)
            return memo[i];
        memo[i] = findFibUsingMemorisation(i - 1, memo) + findFibUsingMemorisation(i - 2, memo);
        return memo[i];
    }


    private static int findFib(int i) {
        if (i <= 1)
            return i;
        return findFib(i - 1) + findFib(i - 2);
    }
}
