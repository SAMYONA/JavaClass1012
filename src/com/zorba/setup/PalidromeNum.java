package com.zorba.setup;

public class PalidromeNum {

	public static void main(String[] args) {
		// 3. Write a program to detect all the palindrome from a given array

		int[] array = { 121, 345, 123, 454, 989, 125 };

		System.out.println("Palindrome Numbers:");
		for (int num : array) {
			if (isPalindrome(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isPalindrome(int number) {
		int reversedNumber = 0;
		int originalNumber = number;

		while (number != 0) {
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /= 10;
		}

		return originalNumber == reversedNumber;
	}
}
