package org.example.recursion.pepcoding;

public class Q6_PowerLogarithmic {
    public static void main(String[] args) {
        System.out.println(powerLogarithmic(2, 19));
    }

    private static int powerLogarithmic(int x, int n) {
        if (n == 0)
            return 1;
        int pow = powerLogarithmic(x, n / 2);
        int res = pow * pow;
        return (n % 2 == 1) ? res * x : res;
    }
}
