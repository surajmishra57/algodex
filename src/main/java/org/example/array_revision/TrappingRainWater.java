package org.example.array_revision;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWaterUsingTwoPointer(arr));
    }

    private static int maxWaterUsingTwoPointer(int[] arr) {
        int res = 0;
        int left = 1, right = arr.length - 2;
        int lMax = arr[left - 1];
        int rMax = arr[right + 1];
        while (left <= right) {
            if (rMax <= lMax) {
                res += Math.max(0, rMax - arr[right]);
                rMax = Math.max(rMax, arr[right]);
                right--;
            } else {
                res += Math.max(0, lMax - arr[left]);
                lMax = Math.max(lMax, arr[left]);
                left++;
            }
        }
        return res;
    }
}
