package com.example;

public class Reverse {
	public static void main(String[] args) {
		int[] originalArray = {1,2,3,4,5};
		
		System.out.println("Original array : ");
		printArray(originalArray);
		
		reverseArray(originalArray);
		
		System.out.println("\nReversed array : ");
		printArray(originalArray);
	}
	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		for (int i = 0; i< arr.length / 2; i++) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	public static void printArray(int[] arr) {
		for (int num : arr ) {
			System.out.println(num + " ");
			
		}
		System.out.println();
	}
}