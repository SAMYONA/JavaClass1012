package com.assignment;

public class QUes04 {
	public static void main(String[] args) {
		// 4. Write a program to iterate all the numbers from the array and multiply by
		// 5 to each Number and store the updated value in a different array and print
		// those values from new array

		int[] array = { 1, 2, 3, 4, 5 };

		int[] multipliedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			multipliedArray[i] = array[i] * 5;
		}

		System.out.print("Multiplied array: ");
		for (int num : multipliedArray) {
			System.out.print(num + " ");
		}
		System.out.println();

	}
}



