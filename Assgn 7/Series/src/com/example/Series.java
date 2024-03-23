package com.example;

public class Series {
    public static void main(String[] args) {
        int[] series = generateSeries(6); // Adjust the parameter to change the length of the series
        for (int i : series) {
            System.out.print(i + " ");
        }
    }

    public static int[] generateSeries(int length) {
        int[] series = new int[length];
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                // If index is even, cube the index + 1
                series[i] = (i + 1) * (i + 1) * (i + 1);
            } else {
                // If index is odd, square the index + 1
                series[i] = (i + 1) * (i + 1);
            }
        }
        return series;
    }
}

