package com.zorba.setup;

public class TA02 {

	// 1. Write a program to check if a particular number is available inside an
	// integer array

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int num = 9;
		boolean isPresent = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				isPresent = true;
				break;
			}
		}

		if (isPresent) {
			System.out.println("Number is present in the array.");
		} else {
			System.err.println("Number is not present in the array.");
		}
	}
}