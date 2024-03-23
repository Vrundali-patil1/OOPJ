package com.example;

public class Number {
	public static void main(String[] args) {
		int[] arr = {3,8,9,4,6,2,1};
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0 ; i < arr.length;i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Smallest number: " +min);
		System.out.println("Largest number: "+max);
	}

}
