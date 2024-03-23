package com.example;

public class Average {
	public static void main(String[] args) {
		int[] inputArray = { 5, 14, 35, 89, 140 };
		runningAverage(inputArray);
	}

	public static void runningAverage(int[] arr) {
		if (arr.length < 3) {
			return;
		}

		int[] averages = new int[arr.length - 2];
		for (int i = 0; i < arr.length - 2; i++) {
			averages[i] = (arr[i] + arr[i + 1] + arr[i + 2]) / 3;
		}
		System.out.print("Output: [");
		for (int m = 0; m < averages.length; m++) {

			if (m > 0) {
				System.out.print(",");
			}

			System.out.print(averages[m]);

		}
		System.out.print("]");
	}
}
