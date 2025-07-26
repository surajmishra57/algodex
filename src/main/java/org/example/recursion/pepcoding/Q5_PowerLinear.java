package org.example.recursion.pepcoding;

public class Q5_PowerLinear {
    public static void main(String[] args) {
        System.out.println(powerLinear(2, 1));
    }

    private static int powerLinear(int x, int n) {
        if (n == 0)
            return 1;
//        else if (n == 1)
//            return x;
        return x * powerLinear(x, n - 1);

    }
}
