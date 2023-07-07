package com.zorba.setup;

public class TA02 {

	/**
	 * 
	 * 1. Write a program to check if a particular number is
	 * available inside an integer array
	 * 
	 * 2. Write a program to verify the odd and even numbers from a given array.
	 * 
	 * 3. Write a program to detect all the palindrome from a given array
	 * 
	 * 4. Write a program to iterate all the numbers from the array and multiply by
	 * 5 to each Number and store the updated value in a different array and print
	 * those values from new array
	 * 
	 * 5. Write a program to copy one array to another array but in reverse order
	 */

	public static boolean isNumberPresent(int[] array, int number) {
		for (int num : array) {
			if (num == number) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int number = 3;
		if (isNumberPresent(array, number)) {
			System.out.println("Number is present in the array");
		} else {
			System.out.println("Number is not present in the array");
		}
	}
}
