package com.assignment;

public class Ques02 {

	// 2. Write a program to verify the odd and even numbers from a given array.

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Odd numbers:");
		for (int num : array) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}

		System.out.println("Even numbers:");
		for (int num : array) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}