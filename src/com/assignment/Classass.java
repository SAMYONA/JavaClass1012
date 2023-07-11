package com.assignment;

import java.util.Arrays;

public class Classass {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 5, 3, 4, 5 };
		int[] secondArray = new int[firstArray.length];
		int count = 0;
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] != 5) {
				secondArray[count] = firstArray[i];
				count++;
			}
		}

		secondArray = Arrays.copyOf(secondArray, count);

		System.out.println("First Array:");
		for (int num : firstArray) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("Second Array:");
		for (int num : secondArray) {
			System.out.print(num + " ");
		}
	}
}
