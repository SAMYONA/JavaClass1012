package com.assignment;

public class Quest03 {

	// Q3. Write a program to find out the duplicate numbers from a given array. ( a
	// number can appears more than 2 times also)

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 3, 4, 5, 2, 3, 4, 5, 5 };
		int[] duplicateNumbers = new int[numbers.length];
		int duplicatesIndex = 0;

		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
				}
			}
			if (count > 0) {
				duplicateNumbers[duplicatesIndex++] = numbers[i];
			}
		}

		System.out.print("Duplicate Numbers: ");
		for (int i = 0; i < duplicatesIndex; i++) {
			System.out.print(duplicateNumbers[i] + " ");
		}
		System.out.println();

	}
}
