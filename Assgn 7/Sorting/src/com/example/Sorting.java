package com.example;
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {24, 54, 31, 16, 82, 45, 67};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        System.out.println(+ thirdMax +  " (" + max + " and " + secondMax + " are the largest and second-largest)");
    }
}




   

