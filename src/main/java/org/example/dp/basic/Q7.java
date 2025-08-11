package org.example.dp.basic;

/**
 * Maximize the number of segments of length x, y and z
 * Last Updated : 11 Jul, 2025
 * Given a rod of length n, the task is to cut the rod in such a way that the total number of segments of length x, y, and z is maximized. The segments can only be of length x, y, and z.
 * Note: If no segment can be cut then return 0.
 * <p>
 * Examples:
 * <p>
 * Input: n = 4, x = 2, y = 1, z = 1
 * Output: 4
 * Explanation: Total length is 4, and the cut lengths are 2, 1 and 1.  We can make maximum 4 segments each of length 1.
 * <p>
 * Input: n = 5, x = 5, y = 3, z = 2
 * Output: 2
 * Explanation: Here total length is 5, and the cut lengths are 5, 3 and 2. We can make two segments of lengths 3 and 2.
 * <p>
 * Input: n = 7, x = 8, y = 9, z = 10
 * Output: 0
 * Explanation: Here the total length is 7, and the cut lengths are 8, 9, and 10. We cannot cut the segment into lengths that fully utilize the segment, so the output is 0.
 */
public class Q7 {
    public static void main(String[] args) {
        int n = 4, x = 2, y = 1, z = 1;
        System.out.println(maximizeTheCuts(n, x, y, z));
    }

    private static int maximizeTheCuts(int n, int x, int y, int z) {
        int res = maxCutHelper(n, x, y, z);
        if (res == -1) {
            return 0;
        }
        return res;
    }

    private static int maxCutHelper(int n, int x, int y, int z) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        int cut1 = maximizeTheCuts(n - x, x, y, z);
        int cut2 = maximizeTheCuts(n - y, x, y, z);
        int cut3 = maximizeTheCuts(n - z, x, y, z);

        int maxCut = Math.max(cut1, Math.max(cut2, cut3));
        if (maxCut == -1) {
            return -1;
        }
        return maxCut + 1;
    }
}
