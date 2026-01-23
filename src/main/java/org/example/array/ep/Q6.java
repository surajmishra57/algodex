package org.example.array.ep;

public class Q6 {
    public static void main(String[] args) {
        int arr[] = {1, -4, 3, -6, 7, 0};
        int data = findTripletMaximumProduct(arr);
        System.out.println(data);

    }


    private static int findTripletMaximumProduct(int[] arr) {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (var data : arr) {
            if (data > firstMax) {
                third = secondMax;
                secondMax = firstMax;
                firstMax = data;
            } else if (data > secondMax && data != firstMax) {
                third = secondMax;
                secondMax = data;
            } else if (data > third && data != firstMax && data != secondMax) {
                third = data;
            }
        }
        for (var data : arr) {
            if (data < firstMin) {
                secondMin = firstMin;
                firstMin = data;
            } else if (data < secondMin && data != firstMin) {
                secondMin = data;
            }
        }

        return Math.max(firstMax * secondMax * third, firstMin * secondMin * firstMax);

    }
}
