package com.assignment;

public class Assign4Q1 {
	// Java Program to find the reverse of an array

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.print("Original array: ");
		printArray(arr);

		reverseArray(arr);

		System.out.print("Reversed array: ");
		printArray(arr);
	}

	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
