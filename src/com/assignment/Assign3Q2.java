package com.assignment;

import java.util.Scanner;

public class Assign3Q2 {
	// Java Program to count the total number of elements in an array:

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		int count = arr.length;
		System.out.println("Total number of elements in the array: " + count);

	}
}
