package com.zorba.setup;

public class Loop29 {

	// 1. Write a program to calculate the sum of first 10 natural number.

	public static void main(String[] args) {

		int n = 10; // natural numbers
		int sum = 0; // Variable to store the sum

		for (int i = 1; i <= n; i++) {
			sum += i; // Add current number to the sum
		}

		System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
	}
}
