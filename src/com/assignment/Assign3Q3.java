package com.assignment;

import java.util.Scanner;

public class Assign3Q3 {
//Java Program to count the total number of even and odd elements in an array:

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Total number of even elements: " + evenCount);
		System.out.println("Total number of odd elements: " + oddCount);

	}
}
