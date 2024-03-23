package com.example;

public class Merge {
	public static void main(String[] args) {
		int[] arr1 = {23, 60, 94, 3, 102};
		int[] arr2 = {42, 16, 74};
		
		int[] mergeArray = new int[arr1.length + arr2.length];
		
		int i = 0, j = 0, k = 0;
		
		while (i < arr1.length && j < arr2.length) {
			mergeArray[k++] = arr1[i++];
			mergeArray[k++] = arr2[j++];
			
		}
		while (i < arr1.length) {
			mergeArray[k++] = arr1[i++];	
		}
		while (j < arr2.length) {
			mergeArray[k++] = arr2[j++];
		}
		
		System.out.print("Output: [");
		for (int m = 0 ; m < mergeArray.length; m++ ) {
			if (m>0) {
				System.out.print(",");
			}
			System.out.print(mergeArray[m]);
		}
		System.out.print("]");
	}

}
