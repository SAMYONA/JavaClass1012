package com.assignment;

import java.util.Arrays;

public class Quest04 {

	public static void main(String[] args) {

		//// 4. Write a program to create an array of size 5 . Then copy that array to
		//// another array of size 4 by deleting the 1st index number from first array

		int creatingArrayOfSize5[] = { 10, 20, 30, 40, 50 };

		int anotherArrayofSize4ToBeCopied[] = new int[4];

		for (int i = 0, j = 0; i < creatingArrayOfSize5.length; i++) {
			if (i != 1) {
				anotherArrayofSize4ToBeCopied[j] = creatingArrayOfSize5[i];
				j++;
			}
		}
		System.out.println("Array1: " + Arrays.toString(creatingArrayOfSize5));

		System.out.println("Array2: " + Arrays.toString(anotherArrayofSize4ToBeCopied));

	}

}
