package com.example;

public class WithoutSoring {
    public static void main(String[] args) {
        int[] arr1 = {5, 14, 35, 90, 139};
        printOrder(arr1);

        int[] arr2 = {88, 67, 35, 14, -12};
        printOrder(arr2);

        int[] arr3 = {65, 14, 129, 34, 7};
        printOrder(arr3);
    }

    public static void printOrder(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
            } else if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("Ascending");
        } else if (descending) {
            System.out.println("Descending");
        } else {
            System.out.println("Random");
        }
    }
}

