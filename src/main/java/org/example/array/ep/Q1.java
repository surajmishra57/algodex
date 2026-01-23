package org.example.array.ep;

public class Q1 {
    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr = {10, 10, 10};
        int data = findSecondLargsetElement(arr);
        System.out.println(data + " is second largest element");
    }

    private static int findSecondLargsetElement(int[] arr) {
        int first = -1, second = -1;
        for (var data : arr) {
            if (data > first) {
                second = first;
                first = data;
            } else if (data > second && data != first) {
                second = data;
            }
        }

        return second;
    }
}
