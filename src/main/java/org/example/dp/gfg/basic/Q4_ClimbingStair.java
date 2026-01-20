package org.example.dp.gfg.basic;

public class Q4_ClimbingStair {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countNumberOfWayUsingOneAndTwoStep(n));
    }

    private static int countNumberOfWayUsingOneAndTwoStep(int n) {
        if (n == 0)
            return 1;
        else if (n < 0) {
            return 0;

        }
        return countNumberOfWayUsingOneAndTwoStep(n - 1) + countNumberOfWayUsingOneAndTwoStep(n - 2);
    }


}
