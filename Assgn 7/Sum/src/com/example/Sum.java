package com.example;


class Equal {
	int arr[] = {2,4,3,5,6,4,7,9,-2};
	int target = 7;
	public void sumEqual() {
		System.out.println("Pairs with sum equal to " + target + ":");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == target) {
				System.out.println("(" +arr[i] + "," +arr[j] + ")");
				}
			}
		}
	}
}
public class Sum {
	public static void main(String[] args) {
	
	
	Equal equal = new Equal();
	equal.sumEqual();
	}
	
    

}